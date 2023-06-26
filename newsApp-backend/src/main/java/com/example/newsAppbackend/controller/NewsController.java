package com.example.newsAppbackend.controller;

import com.example.newsAppbackend.response.ArticleResult;
import com.example.newsAppbackend.response.NewsArticle;
import com.example.newsAppbackend.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping(value = "/news-data")
    public NewsArticle getAllNews()
    {
       return newsService.getNews();

    }

}
