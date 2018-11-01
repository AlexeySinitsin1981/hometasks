package ru.sinitsin.lesson18.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("phonebook.txt"));

            while (reader.ready()) {
                String st = reader.readLine();
                System.out.println(st);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("phonebook.txt")) {
            int b;
            byte[] buffer = new byte[100];
            if ((b = is.read(buffer)) != -1) {
                String s = new String(buffer);
                s = s.replaceAll(" - [0-9]{11}", "");
                try (OutputStream os = new FileOutputStream("phonebook2.txt")) {
                    os.write(s.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

