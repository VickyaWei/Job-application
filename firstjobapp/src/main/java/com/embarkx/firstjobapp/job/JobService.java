package com.embarkx.firstjobapp.job;

import java.util.List;

/**
 * @author vickyaa
 * @date 8/31/24
 * @file JobService
 */
public interface JobService {

    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
