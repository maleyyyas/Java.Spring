package com.example.MyBookShopApp.data.dto;
import  com.example.MyBookShopApp.data.book.Book;

import java.util.List;

public class BooksPageDTO {

    private Integer count;
    private List<Book> books;

    public BooksPageDTO(List<Book> books) {
        this.count = books.size();
        this.books = books;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
