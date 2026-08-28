package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.ProjectStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ProjectId;
    @Column(nullable = false,unique = true)
    private String ProjectName;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProjectStatus ProjectStatus;
    private LocalDate DateCreated;

    public Project() {
    }

    public Project(String ProjectName, ProjectStatus ProjectStatus, LocalDate DateCreated) {
        this.ProjectName = ProjectName;
        this.ProjectStatus = ProjectStatus;
        this.DateCreated = DateCreated;
    }

    public String getName() {
        return ProjectName;
    }

    public void setName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(int ProjectId) {
        this.ProjectId = ProjectId;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate DateCreated) {
        this.DateCreated = DateCreated;
    }

    public ProjectStatus getStatus() {
        return ProjectStatus;
    }

    public void setStatus(ProjectStatus ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }
}
