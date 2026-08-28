package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.projectStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "project")
public class project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int project_id;
    @Column(nullable = false,unique = true)
    private String project_name;
    @Column(nullable = false)
    private projectStatus projectStatus;
    private LocalDate dateCreated;


    public project(String project_name,projectStatus projectStatus,LocalDate dateCreated) {
        this.project_name = project_name;
        this.projectStatus = projectStatus;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return project_name;
    }

    public void setName(String project_name) {
        this.project_name = project_name;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public projectStatus getStatus() {
        return projectStatus;
    }

    public void setStatus(projectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }
}
