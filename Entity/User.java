package com.example.telematos_api.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "isadmin")
    private int isAdmin;
}
