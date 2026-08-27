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
    private String name;
    @Column(nullable = false)
    private projectStatus status;
    private LocalDate dateCreated;


    public project(String name,projectStatus status,LocalDate dateCreated) {
        this.name = name;
        this.status = status;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return status;
    }

    public void setStatus(projectStatus status) {
        this.status = status;
    }
}
