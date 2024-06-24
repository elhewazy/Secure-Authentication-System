package com.elhewazy.blogg.Dao;

import com.elhewazy.blogg.entity.Posts;
import com.elhewazy.blogg.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostDao extends JpaRepository<Posts,Integer> {

}
