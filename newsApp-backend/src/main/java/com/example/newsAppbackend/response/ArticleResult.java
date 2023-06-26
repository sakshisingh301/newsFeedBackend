package com.example.newsAppbackend.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleResult {
    private String title;
    private String link;
    private List<String> keywords;
    @JsonProperty("creator")
    private List<String> creator;
    @JsonProperty("video_url")
    private String video_url;
    private String description;
    private String content;
    private String pubDate;
    @JsonProperty("image_url")
    private String image_url;
    @JsonProperty("source_id")
    private String source_id;
    private List<String> category;
    private List<String> country;
    private String language;


}
