package com.dejoie.projectManagementSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(nullable = false,unique = true)
    private String users_name;
    @Column(nullable = false,unique = false)
    private String email;
    private String password;
    private LocalDate dateCreated;

    public users(String users_name, String email,LocalDate dateCreated,String password) {
        this.email = email;
        this.users_name = users_name;
        this.dateCreated = dateCreated;
        this.password = password;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return users_name;
    }

    public void setName(String users_name) {
        this.users_name = users_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
