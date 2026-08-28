package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.ProjectRole;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "ProjectMember")
public class ProjectMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProjectMemberId;
    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;
    @JoinColumn(name = "ProjectId")
    @ManyToOne
    private Project Project;
    @Enumerated(EnumType.STRING)
    private ProjectRole ProjectRole;
    private LocalDate DateAdded;

    public ProjectMember() {
    }

    public ProjectMember(LocalDate DateAdded, Project Project, ProjectRole ProjectRole, User user) {
        this.DateAdded = DateAdded;
        this.Project = Project;
        this.ProjectRole =ProjectRole;
        this.user = user;
    }

    public LocalDate getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(LocalDate DateAdded) {
        this.DateAdded = DateAdded;
    }

    public Project getProject() {
        return Project;
    }

    public void setProject(Project Project) {
        this.Project = Project;
    }

    public int getProjectMemberId() {
        return ProjectMemberId;
    }

    public void setProjectMemberId(int ProjectMemberId) {
        this.ProjectMemberId = ProjectMemberId;
    }

    public ProjectRole getProjectRole() {
        return ProjectRole;
    }

    public void setProjectRole(ProjectRole ProjectRole) {
        this.ProjectRole =ProjectRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
