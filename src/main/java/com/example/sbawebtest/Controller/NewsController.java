package com.example.sbawebtest.Controller;

import com.example.sbawebtest.pojo.News;
import com.example.sbawebtest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping(value = "pojo/news")
    public List<News> getNews(){
        return newsService.searchAllNews() ;
    }


}
