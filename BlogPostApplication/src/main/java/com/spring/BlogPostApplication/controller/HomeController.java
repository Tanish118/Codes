package com.spring.BlogPostApplication.controller;

import com.spring.BlogPostApplication.model.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
@RestController
public class HomeController {
    @RequestMapping("/getAllPosts")
    public String getAllPosts(){
       // System.out.print("Hello");
        ArrayList <Post> posts = new ArrayList<>();

        Post post1=new Post();
        post1.setTitle("iPhone");
        post1.setBody("iPhone wale Bot");
        post1.setDate(new Date());

        Post post2=new Post();
        post1.setTitle("Tech");
        post1.setBody("Tesla CEO is ELon Musk");
        post1.setDate(new Date());

        Post post3=new Post();
        post1.setTitle("ie");
        post1.setBody("iAI wale Bot");
        post1.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
return "yes";
    }
}
