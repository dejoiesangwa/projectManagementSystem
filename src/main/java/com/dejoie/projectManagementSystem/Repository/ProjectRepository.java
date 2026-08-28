package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
