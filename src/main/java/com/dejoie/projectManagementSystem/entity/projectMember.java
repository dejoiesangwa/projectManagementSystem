package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.projectRole;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "project_member")
public class projectMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectMember_id;
    @OneToOne
    @JoinColumn(name = "users_name")
    private users projectMember_name;
    @JoinColumn(name = "project_name")
    @ManyToOne
    private project project_of_projectMember;
    private projectRole role;
    private LocalDate dateAdded;

    public projectMember(LocalDate dateAdded, project project_of_projectMember, projectRole role, users projectMember_name) {
        this.dateAdded = dateAdded;
        this.project_of_projectMember = project_of_projectMember;
        this.role = role;
        this.projectMember_name = projectMember_name;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public project getProject_of_projectMember() {
        return project_of_projectMember;
    }

    public void setProject_of_projectMember(project project_of_projectMember) {
        this.project_of_projectMember = project_of_projectMember;
    }

    public int getProjectMember_id() {
        return projectMember_id;
    }

    public void setProjectMember_id(int projectMember_id) {
        this.projectMember_id = projectMember_id;
    }

    public projectRole getRole() {
        return role;
    }

    public void setRole(projectRole role) {
        this.role = role;
    }

    public users getProjectMember_name() {
        return projectMember_name;
    }

    public void setProjectMember_name(users projectMember_name) {
        this.projectMember_name = projectMember_name;
    }
}
