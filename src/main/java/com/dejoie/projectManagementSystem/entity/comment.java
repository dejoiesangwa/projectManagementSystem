package com.dejoie.projectManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;
    @ManyToOne
    @JoinColumn(name = "task_tittle")
    private Task Task_name;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "projectMember_name")
    private projectMember commenter;

    public comment(String comment, projectMember commenter, Task task_name) {
        this.comment = comment;
        this.commenter = commenter;
        Task_name = task_name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public projectMember getCommenter() {
        return commenter;
    }

    public void setCommenter(projectMember commenter) {
        this.commenter = commenter;
    }

    public Task getTask_name() {
        return Task_name;
    }

    public void setTask_name(Task task_name) {
        Task_name = task_name;
    }
}
