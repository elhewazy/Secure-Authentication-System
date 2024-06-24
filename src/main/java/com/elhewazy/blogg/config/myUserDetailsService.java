package com.elhewazy.blogg.config;

import com.elhewazy.blogg.Dao.UserDao;
import com.elhewazy.blogg.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class myUserDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Users> user = this.userDao.findByEmail(email);
        return user.map(MyUserInfoDetails::new).orElseThrow(()->
                new UsernameNotFoundException("User Does Not Exist"));
    }
}
