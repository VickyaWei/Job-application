package com.embarkx.jobms.job.mapper;

import com.embarkx.jobms.job.Job;
import com.embarkx.jobms.job.external.Company;
import com.embarkx.jobms.job.dto.JobDTO;
import com.embarkx.jobms.job.external.Review;

import java.util.List;

/**
 * @author vickyaa
 * @date 9/12/24
 * @file JobMapper
 */
public class JobMapper {
    public static JobDTO mapToJobWithCompanyDto(
            Job job, Company company, List<Review> review
    ){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setCompany(company);
        jobDTO.setReviews(review);
        return jobDTO;

    }
}
