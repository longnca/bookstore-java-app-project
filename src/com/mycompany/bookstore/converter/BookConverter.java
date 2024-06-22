package com.mycompany.bookstore.converter;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.entity.BookEntity;

public class BookConverter {

    // we pass the BookDTO object to the method to return the object type of BookEntity
    public static BookEntity convertBookDTOtoBookEntity(BookDTO bookDTO) {

        BookEntity be = new BookEntity();
        be.setAuthorEmail(bookDTO.getAuthorEmail());
        be.setAuthorName(bookDTO.getAuthorName());
        be.setAvailableQty(bookDTO.getAvailableQty());
        be.setBookId(bookDTO.getBookId());
        be.setDescription(bookDTO.getDescription());
        be.setName(bookDTO.getName());
        be.setPricePerQty(bookDTO.getPricePerQty());

        return be;

    }
}
