package com.example.sbawebtest.Controller;



import com.example.sbawebtest.pojo.Comment;
import com.example.sbawebtest.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "pojo/comments")
    public List<Comment> getComment(){
        return commentService.searchAllComments() ;
    }
}
