package ru.sinitsin.lesson8.task3;

import java.util.Scanner;

public class Calculator {


    public static void sum(double a,double b) {
        double sum =  a + b;
        System.out.println(sum);
    }
    public static void subtraction(double a, double b){
        double sub = a-b;
        System.out.println(sub);
    }
    public static void multiplication(double a, double b){
        double mult = a*b;
        System.out.println(mult);
    }
    public static void division(double a, double b){
        double div = a/b;
        System.out.println(div);
    }
    public static void percOfNumber (double a,double b){
        double percOfNumber = (a * b)/100;
        System.out.println(percOfNumber);
    }

}
