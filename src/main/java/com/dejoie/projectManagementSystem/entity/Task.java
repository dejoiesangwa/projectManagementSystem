package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.taskStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int task_id;
    @Column(unique = true,nullable = false)
    private String task_tittle;
    private taskStatus taskStatus;
    @ManyToOne
    @JoinColumn(name = "projectMember_name")
    private projectMember assignedTo;
    @ManyToOne
    @JoinColumn(name="project_name")
    private project task_project;
    private LocalDate dueDate;

    public Task(projectMember assignedTo, LocalDate dueDate, project task_project, taskStatus taskStatus, String task_tittle) {
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.task_project = task_project;
        this.taskStatus = taskStatus;
        this.task_tittle = task_tittle;
    }

    public projectMember getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(projectMember assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public project getProject() {
        return task_project;
    }

    public void setProject(project task_project) {
        this.task_project = task_project;
    }

    public taskStatus getStatus() {
        return taskStatus;
    }

    public void setStatus(taskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTitle() {
        return task_tittle;
    }

    public void setTitle(String task_tittle) {
        this.task_tittle = task_tittle;
    }
}
