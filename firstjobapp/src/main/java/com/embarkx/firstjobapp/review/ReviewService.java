package com.embarkx.firstjobapp.review;

import java.util.List;

/**
 * @author vickyaa
 * @date 9/3/24
 * @file ReviewService
 */
public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId, Long reviewId);
    boolean updateReview(Long companyId, Long reviewId, Review review);
    boolean deleteReview(Long companyId, Long reviewId);
}
