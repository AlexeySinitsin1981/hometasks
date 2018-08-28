package ru.sinitsin.lesson5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(reader.nextLine());
        if(number<0){
            System.out.println("The number is negative!");
        }else if(number>0){
            System.out.println("The number is positive!");
        }else{
            System.out.println("Your number is zero!");
        }

        if(number%2==0){
            System.out.println("The number is even!");
        }else{
            System.out.println("The number is not even!");
        }
    }
}
