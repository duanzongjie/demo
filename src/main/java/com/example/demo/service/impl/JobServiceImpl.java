package com.example.demo.service.impl;

import com.example.demo.mapper.JobMapper;
import com.example.demo.model.Job;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobServiceImpl implements JobService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public List<Job> findAllJob() {
        return jobMapper.findAllJob();
    }

    @Override
    public Job getJobById(int jobId) {
        return jobMapper.getJobById(jobId);
    }

    @Override
    public int addJob(int id, String name, String remarks) {
        return jobMapper.addJob(id,name,remarks);
    }
}
