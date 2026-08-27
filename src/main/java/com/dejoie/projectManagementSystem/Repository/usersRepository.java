package com.dejoie.projectManagementSystem.Repository;

import com.dejoie.projectManagementSystem.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users,Integer> {
}
