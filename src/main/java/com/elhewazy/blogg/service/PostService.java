package com.elhewazy.blogg.service;

import com.elhewazy.blogg.entity.Posts;

import java.util.List;

public interface PostService {

    public String addPost(Posts post);
    public String deletPost(Posts post);
    public String updatePost(Posts post);
    public List<Posts> getPosts();
    public String getPost();

}
