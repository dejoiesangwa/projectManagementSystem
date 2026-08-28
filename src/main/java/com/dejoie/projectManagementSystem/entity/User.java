package com.dejoie.projectManagementSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    @Column(nullable = false,unique = true)
    private String UserName;
    @Column(nullable = false,unique = true)
    private String Email;
    private LocalDate DateCreated;

    public User() {
    }

    public User(String UserName, String Email, LocalDate DateCreated) {
        this.Email = Email;
        this.UserName = UserName;
        this.DateCreated = DateCreated;

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String UserName) {
        this.UserName = UserName;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate DateCreated) {
        this.DateCreated = DateCreated;
    }
}
