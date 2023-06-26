package com.example.newsAppbackend.response;

import java.util.List;

public class NewsArticle {
    private String status;
    private int totalResults;
    private List<ArticleResult> results;
    private String nextPage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<ArticleResult> getResults() {
        return results;
    }

    public void setResults(List<ArticleResult> results) {
        this.results = results;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
}

