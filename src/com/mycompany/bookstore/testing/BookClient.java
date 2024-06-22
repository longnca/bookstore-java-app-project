package com.mycompany.bookstore.testing;

import com.mycompany.bookstore.controller.BookController;
import com.mycompany.bookstore.dto.BookDTO;

import java.awt.print.Book;

public class BookClient {
    public static void main(String[] args) {
        // Constructor
        BookController controller = new BookController();
        // Call the addBook method
        addBook(controller);
        // Call the getBook method
        getBook(controller, 111L);
    }

    private static void addBook(BookController controller) {
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

        if (bookId != null) {
            System.out.println("Book was successfully created with Id: " + bookId);
        } else {
            System.out.println("Some errors occurred while creating a new book.");
        }
    }

    private static void getBook(BookController controller, Long bookId) {
        BookDTO bookDTO = controller.getBook(bookId);
        System.out.println("Following are details for Book with ID: " + bookId);
        System.out.println("Book name: " + bookDTO.getName());
        System.out.println("Book author: " + bookDTO.getAuthorName());
        System.out.println("Book price: " + bookDTO.getPricePerQty());
    }
}
