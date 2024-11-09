package com.embarkx.firstjobapp.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author vickyaa
 * @date 8/31/24
 * @file JobRepository
 */
public interface JobRepository extends JpaRepository<Job, Long> {

}
