package com.elhewazy.blogg.controller;

import com.elhewazy.blogg.entity.Posts;
import com.elhewazy.blogg.entity.Users;
import com.elhewazy.blogg.service.PostServiceImp;
import com.elhewazy.blogg.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class PostsController {

    @Autowired
    PostServiceImp psi;
    @Autowired
    UserServiceImp usi;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/user/save")
    public ResponseEntity<Object> addUser(@RequestBody Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Users result = usi.addUser(user);
        if (result.getId() > 0){
            return ResponseEntity.ok("USer Was Saved");
        }
        return ResponseEntity.status(404).body("Error, USer Not Saved");
    }

    @PostMapping("/addpost")
    public String addPost(@RequestBody Posts post){
        return psi.addPost(post);
    }





    public UserDetails getLoggedInUserDetails(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null && authentication.getPrincipal() instanceof UserDetails){
            return (UserDetails) authentication.getPrincipal();
        }
        return null;
    }
}
