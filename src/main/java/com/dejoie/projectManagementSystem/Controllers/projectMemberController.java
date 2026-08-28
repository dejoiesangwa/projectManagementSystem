package com.dejoie.projectManagementSystem.Controllers;

import com.dejoie.projectManagementSystem.Services.ProjectMemberService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectMemberController {
    private final ProjectMemberService projectMemberService;

    public projectMemberController(ProjectMemberService projectMemberService) {
        this.projectMemberService = projectMemberService;
    }
}
