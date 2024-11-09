package com.embarkx.jobms.job.clients;

import com.embarkx.jobms.job.external.Company;
import com.embarkx.jobms.job.external.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "review-service")
public interface ReviewClient {
    @GetMapping("/companies/{companyId}/reviews")
    List<Review> getReviews(@PathVariable("companyId") Long companyId);
}