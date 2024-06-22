package com.mycompany.bookstore.repository.impl;

import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<BookEntity> bookList;

    // Constructor
    public BookRepositoryImpl() {
        this.bookList = new ArrayList<>();
    }

    @Override
    public Long add(BookEntity bookEntity) {
        // Save data to the bookList
        this.bookList.add(bookEntity);
        System.out.println("After saving book in Repository layer: " + this.bookList.get(0).getName());
        return bookEntity.getBookId();
    }
}
