package com.sdias.springwebdemo.repository;

import com.sdias.springwebdemo.datasource.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    private List<Post> post;

    public PostRepository(){
        post = new ArrayList<>();
        post.add(new Post());
    }

    public List<Post> buscarContados(){

        return this.post;
    }


    public void add(Post post) {

        this.post.add(post);
    }
}
