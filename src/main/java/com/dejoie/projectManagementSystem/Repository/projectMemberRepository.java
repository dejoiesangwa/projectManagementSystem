package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.projectMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectMemberRepository extends JpaRepository<projectMember,Integer> {
}
