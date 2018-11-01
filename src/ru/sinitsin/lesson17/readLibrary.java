package ru.sinitsin.lesson17;
import ru.sinitsin.lesson17.Book;

import java.io.*;

public class readLibrary implements Serializable {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("library.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Library lb = null;
            try {
                lb = (Library) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("version="+lb);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}