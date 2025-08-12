package com.shre.SpringBootRest.service;

import com.shre.SpringBootRest.model.JobPost;
import com.shre.SpringBootRest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repository;
    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repository.getAllJobs();
    }
    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repository.addJobPost(jobPost);
    }

    public JobPost getJob(int postId) {
        return repository.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repository.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repository.deleteJob(postId);
    }
}
