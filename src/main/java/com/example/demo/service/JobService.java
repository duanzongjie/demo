package com.example.demo.service;

import com.example.demo.model.Job;

import java.util.List;

public interface JobService {

    List<Job> findAllJob();

    Job getJobById(int jobId);

    int addJob(int id,String name,String remarks);

    int updateJobById(String name,String remarks,int id);

    int delJobById(int id);
}
