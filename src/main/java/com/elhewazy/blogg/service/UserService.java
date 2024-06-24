package com.elhewazy.blogg.service;

import com.elhewazy.blogg.entity.Users;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    public UserDetails findUserByEmai(String email, String password);
    public Users addUser(Users user);
}
