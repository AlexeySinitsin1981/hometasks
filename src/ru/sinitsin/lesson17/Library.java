package ru.sinitsin.lesson17;

import java.io.Serializable;
import java.util.Arrays;


public class Library implements Serializable {

    private Book [] books = new Book[0];




    public void addBook (Book book){
        final int newSize = books.length + 1;
        Book[] newBooks = new Book[newSize];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[newSize - 1] = book;
        books = newBooks;

    }

   /* public String deleteBook (Book book){

    }*/

    public void checkBooks(){

    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
