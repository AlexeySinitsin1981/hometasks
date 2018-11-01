package ru.sinitsin.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя файла, который хотите создать: ");
        Scanner reader = new Scanner(System.in);
        String nameFile = reader.nextLine();
        File file1 = new File(nameFile);
        file1.createNewFile();
        System.out.println("Вы создали файл с именем: " + file1);
        System.out.println("Что вы хотите сделать дальше: переименовать (цифра 1), копировать (цифра 2) или удалить файл (цифра 3)");
        int number = Integer.parseInt(reader.nextLine());
        if(number==1){
            System.out.println("Введите имя файла: ");
            String newFile = reader.nextLine();
            file1.renameTo(new File(newFile));
            System.out.println(file1 + " переименован в " + newFile);
        }else if(number==2){
            Path path = file1.toPath();
            System.out.println("Введите название файла куда хотите скопировать " +file1);
            String copyFile=reader.next();
            Path realPath = Paths.get(copyFile);
            Files.copy(path,realPath);
            System.out.println("файл скоприван в "+copyFile);
        }else if (number==3){
            file1.delete();
            System.out.println("Вы удалили файл: " + file1);
        }





    }
}
