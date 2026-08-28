package com.dejoie.projectManagementSystem.Services;

import com.dejoie.projectManagementSystem.Repository.ProjectMemberRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectMemberService {
    private final ProjectMemberRepository ProjectMemberRepository;

    public ProjectMemberService(ProjectMemberRepository projectMemberRepository) {
        this.ProjectMemberRepository = projectMemberRepository;
    }
}
