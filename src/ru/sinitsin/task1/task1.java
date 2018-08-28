package ru.sinitsin.task1;


import java.util.Scanner;

public class task1 {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int amountGasoline = Integer.parseInt(reader.nextLine());
        int costGasoline = 43;
        int total = costGasoline * amountGasoline;

        System.out.println("Стоимость заправки равна " + total);
    }
}
