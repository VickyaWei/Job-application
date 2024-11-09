package com.embarkx.jobms.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author vickyaa
 * @date 8/31/24
 * @file JobRepository
 */

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
