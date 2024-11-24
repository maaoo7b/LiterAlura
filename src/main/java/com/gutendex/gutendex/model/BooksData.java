package com.gutendex.gutendex.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BooksData (
        @JsonAlias("title")
        String title,
        @JsonAlias("authors")
        List<AuthorsData> authors,
        @JsonAlias("download_count")
        int downloads
){
}
