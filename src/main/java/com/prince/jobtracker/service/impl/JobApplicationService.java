package com.prince.jobtracker.service.impl;

import com.prince.jobtracker.entity.JobApplication;

import java.util.List;

public interface JobApplicationService {
    JobApplication create(JobApplication application);
    List<JobApplication> getAll();
    JobApplication getById(Long id);
    JobApplication update(Long id, JobApplication application);
    void delete(Long id);
}
