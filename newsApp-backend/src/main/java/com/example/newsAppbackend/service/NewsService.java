package com.example.newsAppbackend.service;

import com.example.newsAppbackend.response.NewsArticle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    private final RestTemplate restTemplate;
    private final String apiUrl;

    public NewsService(RestTemplate restTemplate, @Value("${news.api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }
    @Scheduled(fixedDelay = 60000)
    public NewsArticle getNews() {
        ResponseEntity<NewsArticle> response = restTemplate.getForEntity(apiUrl, NewsArticle.class);
        return response.getBody();
    }
}


