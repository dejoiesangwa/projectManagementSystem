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
    @JoinColumn(name = "user_id")
    private users users;
    @JoinColumn(name = "project_id")
    @ManyToOne
    private project project;
    private projectRole role;
    private LocalDate dateAdded;

    public projectMember(LocalDate dateAdded, project project, projectRole role, users users) {
        this.dateAdded = dateAdded;
        this.project = project;
        this.role = role;
        this.users = users;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public project getProject() {
        return project;
    }

    public void setProject(project project) {
        this.project = project;
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

    public users getUsers() {
        return users;
    }

    public void setUsers(users users) {
        this.users = users;
    }
}
