package com.gutendex.gutendex.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Book {
    private String title;
    private Author authors;
    private int downloads;

    public Book(BooksData booksData){
        this.title = booksData.title();
        this.authors = new Author(booksData.authors().get(0));
        this.downloads = booksData.downloads();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", downloads=" + downloads +
                '}';
    }
}
