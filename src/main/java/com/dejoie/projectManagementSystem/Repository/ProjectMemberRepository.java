package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember,Integer> {
}
