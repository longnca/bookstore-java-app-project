package com.mycompany.bookstore.repository;

import com.mycompany.bookstore.entity.BookEntity;

import java.awt.print.Book;

public interface BookRepository {

    public Long add(BookEntity bookEntity);
    public BookEntity getDetail(Long bookId);
}
