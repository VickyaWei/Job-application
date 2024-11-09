package com.embarkx.jobms.job;

import com.embarkx.jobms.job.dto.JobDTO;

import java.util.List;

/**
 * @author vickyaa
 * @date 8/31/24
 * @file JobService
 */
public interface JobService {

    List<JobDTO> findAll();

    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
