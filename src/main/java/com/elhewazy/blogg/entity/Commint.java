package com.elhewazy.blogg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Commint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id ;
    String commint ;
    String name ;
    int postid;
}
