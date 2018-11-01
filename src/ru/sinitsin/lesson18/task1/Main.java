package ru.sinitsin.lesson18.task1;



import java.io.*;

public class Main {
    public static void main(String[] args)  {
        try (OutputStream os = new FileOutputStream("test.txt")){
            os.write("Hello, Мир!".getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("test.txt")){
            int b;
            byte[] buffer = new byte[100];
            if((b=is.read(buffer))!=-1){
                String s = new String(buffer,"Windows-1251");
                try (OutputStream os = new FileOutputStream("test2.txt")){
                    os.write(s.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }



    }

}
