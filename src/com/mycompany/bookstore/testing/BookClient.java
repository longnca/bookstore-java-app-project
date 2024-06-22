package com.mycompany.bookstore.testing;

import com.mycompany.bookstore.controller.BookController;
import com.mycompany.bookstore.dto.BookDTO;

public class BookClient {
    public static void main(String[] args) {

        BookController controller = new BookController();

        // Create the BookDTO and call the controller add(book) method
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookId(111L);
        bookDTO.setAuthorEmail("author1@gmail.com");
        bookDTO.setAuthorName("Author One");
        bookDTO.setAvailableQty(10);
        bookDTO.setName("Book One");
        bookDTO.setDescription("Book One Description");
        bookDTO.setPricePerQty(24.5);

        // Call controller add() method and hold the return value
        Long bookId = controller.add(bookDTO);

        if(bookId != null) {
            System.out.println("Book was successfully created with Id: " + bookId);
        } else {
            System.out.println("Some errors occurred while creating a new book.");
        }
    }
}
