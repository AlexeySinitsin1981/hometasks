package ru.sinitsin.task2;

import java.util.Scanner;

public class task2 {
    public static void main (String[] args){
        //int salary = 70000;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = Integer.parseInt(reader.nextLine());
        double tax = 0.13;
        double sumTax = salary * tax;
        double salaryOnHands = salary-sumTax;

        System.out.println("Your salary after taxes is: "+ salaryOnHands + " rubles");
    }



}
