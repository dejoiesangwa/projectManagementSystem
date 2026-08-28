package com.dejoie.projectManagementSystem.Services;

import com.dejoie.projectManagementSystem.Repository.UserRepository;
import com.dejoie.projectManagementSystem.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository UserRepository;

    public UserService(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }
    public User UserCreation(User User){
        return UserRepository.save(User);
    }
}
