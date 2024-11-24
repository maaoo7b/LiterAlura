package com.gutendex.gutendex.model;

public class Author {
    private String authorName;

    private int birthYear;

    private int deathYear;

    public Author(AuthorsData authorsData) {
        this.authorName = authorsData.authorName();
        this.birthYear = authorsData.birthYear();
        this.deathYear = authorsData.deathYear();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", birthYear=" + birthYear +
                ", deathYear=" + deathYear +
                '}';
    }
}
