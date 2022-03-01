package com.example.securitypatchme;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;

}
