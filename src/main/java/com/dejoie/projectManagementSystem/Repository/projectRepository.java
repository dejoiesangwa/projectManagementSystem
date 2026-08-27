package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends JpaRepository<project,Integer> {
}
