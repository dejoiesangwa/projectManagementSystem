package com.dejoie.projectManagementSystem.Controllers;

import com.dejoie.projectManagementSystem.Services.projectMemberService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectMemberController {
    private final projectMemberService projectMemberService;

    public projectMemberController(projectMemberService projectMemberService) {
        this.projectMemberService = projectMemberService;
    }
}
