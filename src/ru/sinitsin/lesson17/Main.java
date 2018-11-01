package ru.sinitsin.lesson17;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Толстой", 1950);
        Book book2 = new Book("Математика", "Иванов", 1920);


        Library library = new Library();
        library.addBook(book);
        library.addBook(book2);
        library.checkBooks();
        System.out.println(library.toString());

        try (FileOutputStream fos = new FileOutputStream("library.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);){

        oos.writeObject(library);
        oos.flush();
        } catch (IOException e) {
            e.printStackTrace();

        }




    }
}
