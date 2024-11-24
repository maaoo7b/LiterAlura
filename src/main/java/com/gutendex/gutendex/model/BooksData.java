package com.gutendex.gutendex.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BooksData (
        @JsonAlias("title")
        String title,
        @JsonAlias("download_count")
        int downloads
){
}
