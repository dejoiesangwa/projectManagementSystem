package com.dejoie.projectManagementSystem.Services;

import com.dejoie.projectManagementSystem.Repository.taskRepository;
import org.springframework.stereotype.Service;

@Service
public class taskServices {
    private final taskRepository taskRepository;

    public taskServices(taskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
