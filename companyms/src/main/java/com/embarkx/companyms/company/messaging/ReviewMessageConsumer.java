package com.embarkx.companyms.company.messaging;

import com.embarkx.companyms.company.CompanyService;
import com.embarkx.companyms.company.dto.ReviewMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.logging.ErrorManager;

@Service
public class ReviewMessageConsumer {

    private final CompanyService companyService;
    private static final Logger logger = LoggerFactory.getLogger(ReviewMessageConsumer.class);

    public ReviewMessageConsumer(CompanyService companyService) {
        this.companyService = companyService;

    }

    @RabbitListener(queues = "companyRatingQueue")
    public void consumeMessage(ReviewMessage reviewMessage){
        try {
            companyService.updateCompanyRating(reviewMessage);
        } catch (ResponseStatusException e) {
            logger.error("Error processing review message for company {}: {}",
                    reviewMessage.getCompanyId(), e.getMessage());
            // Depending on your requirements, you might want to:
            // 1. Dead-letter the message
            // 2. Retry the operation
            // 3. Simply log the error and continue
        }
    }

}
