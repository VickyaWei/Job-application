package com.embarkx.firstjobapp.company;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vickyaa
 * @date 9/2/24
 * @file CompanyRepository
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
