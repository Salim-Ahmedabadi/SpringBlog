package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts(){
        return "This is the post index page!";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String id(@PathVariable String id){
        return "This is where you would view an individual page!";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "This is where you would view the form for creating a page!";
    }

    @PostMapping ("/posts/create")
    @ResponseBody
    public String newPost(){
        return "This is where you would create a new page!";
    }

}
