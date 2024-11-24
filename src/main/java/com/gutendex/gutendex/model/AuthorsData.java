package com.gutendex.gutendex.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record AuthorsData(
        @JsonAlias("name")
        String authorName,
        @JsonAlias("birth_year")
        int birthYear,
        @JsonAlias("death_year")
        int deathYear
) {
}
