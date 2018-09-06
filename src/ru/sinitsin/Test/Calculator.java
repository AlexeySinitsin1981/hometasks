package ru.sinitsin.Test;

public class Calculator {
    public  void sum(double a,double b) {
        double sum =  a + b;
        System.out.println(sum);
    }
    public  void subtraction(double a, double b){
        double sub = a-b;
        System.out.println(sub);
    }
    public  void multiplication(double a, double b){
        double mult = a*b;
        System.out.println(mult);
    }
    public  void division(double a, double b){
        double div = a/b;
        System.out.println(div);
    }
    public  void percOfNumber (double a,double b){
        double percOfNumber = (a*b)/100;
        System.out.println(a + "%, от числа "+ b + " равно "+percOfNumber);
    }
}
