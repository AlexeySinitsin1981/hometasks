package ru.sinitsin.lesson25.task2;

import ru.sinitsin.lesson23.BasketImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ru.sinitsin.lesson23.BasketImpl bi = new BasketImpl();
        bi.addProduct("Макароны", 12);
        bi.addProduct("Пиво", 23);
        bi.addProduct("Майонез", 57);
        bi.addProduct("Хлеб", 72);
        bi.addProduct("Колбаса", 38);




        System.out.println("------------------------------");


        //bi.updateProductQuantity("Пиво", 5);
        //System.out.println(bi.getProductQuantity("Пиво"));
        //bi.removeProduct("Хлеб");

        List<String> list = bi.getProducts();
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("------------------------------");

        bi.updateProductQuantity("Хлеб", 7);
        System.out.println(bi.getProductQuantity("Хлеб"));
        System.out.println(bi.getProductQuantity("Макароны"));

        System.out.println("--------------------------------");

        bi.removeProduct("Хлеб");
        bi.removeProduct("Макароны");
        for (String s:bi.getProducts()) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        bi.clear();
        for (String s:bi.getProducts()) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------");


    }

    }

