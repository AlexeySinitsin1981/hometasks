package ru.sinitsin.lesson5;

public class task3 {
    public static void main(String[] args) {
        int verticalNumber = 1;
        int number = 1;


        while (verticalNumber<=10){
            System.out.print(verticalNumber + " ");
           // verticalNumber++;

            while (number<=9){
                number++;
                System.out.print(number * verticalNumber + " ");

            }
            verticalNumber++;
            number=1;
            System.out.println("");
        }

    }

}
