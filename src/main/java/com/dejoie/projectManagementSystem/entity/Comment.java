package com.dejoie.projectManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CommentId;
    @ManyToOne
    @JoinColumn(name = "TaskId")
    private Task Task;
    private String Comment;
    @ManyToOne
    @JoinColumn(name = "ProjectMemberId")
    private ProjectMember ProjectMember;

    public Comment() {
    }

    public Comment(String Comment, ProjectMember ProjectMember, Task Task) {
        this.Comment = Comment;
        this.ProjectMember = ProjectMember;
       this.Task = Task;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public int getCommentIdId() {
        return CommentId;
    }

    public void setId(int CommentId) {
        this.CommentId = CommentId;
    }

    public ProjectMember getProjectMember() {
        return ProjectMember;
    }

    public void setProjectMember(ProjectMember ProjectMember) {
        this.ProjectMember = ProjectMember;
    }

    public Task getTask() {
        return Task;
    }

    public void setTask(Task Task) {
       this.Task = Task;
    }
}
