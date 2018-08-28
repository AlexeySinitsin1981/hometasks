package ru.sinitsin.task3;

import java.util.Scanner;

public class task3 {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        //int seconds = Integer.parseInt(args[0]);
        int seconds = Integer.parseInt(reader.nextLine());
        int minutes = seconds/60;
        int hours = minutes/60;

        System.out.println("it's just " + hours + " hours");
    }
}
