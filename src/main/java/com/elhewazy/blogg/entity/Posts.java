package com.elhewazy.blogg.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     int id;
     String name;
     @Column(unique = true)
     String email;
     String post;
     @ManyToMany
     List<Commint> commints;
     boolean adminApprove = false;

     public Posts(String name, String email, String post, List<Commint> commints, boolean adminApprove) {
          this.name = name;
          this.email = email;
          this.post = post;
          this.commints = commints;
          this.adminApprove = adminApprove;
     }
     public Posts(String name, String email, String post, List<Commint> commints) {
          this.name = name;
          this.email = email;
          this.post = post;
          this.commints = commints;
          this.adminApprove = adminApprove;
     }
}
