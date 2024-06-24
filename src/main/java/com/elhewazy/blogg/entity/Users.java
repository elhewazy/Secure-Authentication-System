package com.elhewazy.blogg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    @Column(unique = true)
    String email;
    String password;
    String role;

    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

    }
    public Users( String email, String password) {
        this.email = email;
        this.password = password;
    }
}
