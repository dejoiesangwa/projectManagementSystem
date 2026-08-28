package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskRepository extends JpaRepository<Task,Integer> {
}
