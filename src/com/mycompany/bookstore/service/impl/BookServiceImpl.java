package com.mycompany.bookstore.service.impl;

import com.mycompany.bookstore.converter.BookConverter;
import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.repository.impl.BookRepositoryImpl;
import com.mycompany.bookstore.service.BookService;

import java.awt.print.Book;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    // Constructor
    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }

    /*
     Note that: the BookRepository uses the BookEntity object while this override method uses the BookDTO object
     This design pattern is called Adapter:
     One layer needs a particular data type of the object and another layer needs another type.
     In this Adapter Design Pattern, we have to convert one type to another one so that these layers
     are able to work with each other.
     So, in the next step, we create a class called BookConverter.
     */

    @Override
    public Long add(BookDTO bookDTO) {
        // Convert the DTO to Repository compatible Entity class
        // Adapter Design Pattern
        BookEntity bookEntity = BookConverter.convertBookDTOtoBookEntity(bookDTO);
        return null;
    }
}

