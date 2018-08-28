package ru.sinitsin.lesson5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the third number: ");
        int thirdNumber = Integer.parseInt(reader.nextLine());

        if(firstNumber<=secondNumber && firstNumber<=thirdNumber){
            System.out.println("Smaller number: " + firstNumber);
        }else if(secondNumber<=firstNumber && secondNumber<=thirdNumber){
            System.out.println("Smaller number: " + secondNumber);
        }else{
            System.out.println("Smaller number: " + thirdNumber);
        }

    }

}
