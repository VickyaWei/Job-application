package com.embarkx.firstjobapp.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author vickyaa
 * @date 9/3/24
 * @file ReviewRepository
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCompanyId(Long companyId);
}
