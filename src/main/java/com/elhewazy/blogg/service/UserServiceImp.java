package com.elhewazy.blogg.service;

import com.elhewazy.blogg.Dao.UserDao;

import com.elhewazy.blogg.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

@Autowired
UserDao userDao;



    @Override
    public UserDetails findUserByEmai(String email, String password) {
        return null;
    }

    @Override
    public Users addUser(Users user) {
        return this.userDao.save(user);
    }
}
