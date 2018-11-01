package ru.sinitsin.lesson19;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileReader fl = new FileReader ("product.txt");
            Scanner scanner = new Scanner(fl)
        ){
            System.out.println(String.format("%12s%12s%12s%12s", "Наименование", "Цена","Количество", "Стоимость"));
            System.out.println("================================================");


            while (scanner.hasNext()) {
                String line = scanner.nextLine();
              // System.out.println(st);

                System.out.println(String.format("%-10s", line)); // новый код
                /*float flt = scanner.nextFloat();
                System.out.println(String.format("%-10f", flt)); // новый код
                int num = Integer.parseInt(reader.readLine());
                System.out.println(String.format("%-10d", num)); // новый код*/


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

