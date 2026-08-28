package com.dejoie.projectManagementSystem.Controllers;

import com.dejoie.projectManagementSystem.Services.UserService;
import com.dejoie.projectManagementSystem.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService UserService;

    public UserController(UserService userService) {
        UserService = userService;
    }

    @PostMapping("create-user")
    public User usercreater(@RequestBody User User){
    return UserService.UserCreation(User);
    }
}
