package com.dejoie.projectManagementSystem.Services;

import com.dejoie.projectManagementSystem.Repository.usersRepository;
import org.springframework.stereotype.Service;

@Service
public class usersServices {
    private final usersRepository usersRepository;

    public usersServices(usersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
}
