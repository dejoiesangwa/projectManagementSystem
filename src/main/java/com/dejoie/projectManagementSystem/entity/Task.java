package com.dejoie.projectManagementSystem.entity;

import com.dejoie.projectManagementSystem.enums.TaskStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int TaskId;
    @Column(unique = true,nullable = false)
    private String TaskTittle;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "projectMemberId")
    private ProjectMember ProjectMember;
    @ManyToOne
    @JoinColumn(name="projectId")
    private Project project;
    private LocalDate dueDate;

    public Task() {
    }

    public Task(ProjectMember ProjectMember, LocalDate dueDate, Project project, TaskStatus taskStatus, String TaskTittle) {
        this.ProjectMember = ProjectMember;
        this.dueDate = dueDate;
        this.project = project;
        this.taskStatus = taskStatus;
        this.TaskTittle = TaskTittle;
    }

    public ProjectMember getProjectMember() {
        return ProjectMember;
    }

    public void setProjectMember(ProjectMember ProjectMember) {
        this.ProjectMember = ProjectMember;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TaskStatus getStatus() {
        return taskStatus;
    }

    public void setStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setId(int TaskId) {
        this.TaskId = TaskId;
    }

    public String getTaskTittle() {
        return TaskTittle;
    }

    public void setTaskTittle(String TaskTittle) {
        this.TaskTittle = TaskTittle;
    }
}
