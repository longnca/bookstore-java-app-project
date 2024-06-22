package com.mycompany.bookstore.serdeser;

import com.mycompany.bookstore.entity.BookEntity;

import java.io.*;

public class BookSerializer {

    public static void serializeBook(BookEntity bookEntity) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            // Saving of object in a file
            fos = new FileOutputStream(bookEntity.getBookId() + ".ser");
            oos = new ObjectOutputStream(fos);
            // Method for serialization of object
            oos.writeObject(bookEntity);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Deserialization is a process converting the stream of bytes stored in the data in the file back into its object.
     *
     * @param bookId
     * @return
     */
    public static BookEntity deSerializeBook(Long bookId) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        BookEntity be = null;
        try {
            //
            fis = new FileInputStream(bookId + ".ser");
            ois = new ObjectInputStream(fis);
            //
            be = (BookEntity) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return be;
    }
}
