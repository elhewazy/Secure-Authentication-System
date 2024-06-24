package com.elhewazy.blogg.service;

import com.elhewazy.blogg.Dao.PostDao;
import com.elhewazy.blogg.entity.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImp implements PostService{
    @Autowired
    PostDao pd;
    @Override
    public String addPost(Posts post) {
        Posts result=  pd.save(post);
        return result.getPost();
    }

    @Override
    public String deletPost(Posts post) {
        return "";
    }

    @Override
    public String updatePost(Posts post) {
        return "";
    }

    @Override
    public List<Posts> getPosts() {
        return List.of();
    }

    @Override
    public String getPost() {
        return "";
    }
}
