package ru.sinitsin.lesson21.task2;

public class Main {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < number.length; i++) {
                System.out.print(number[i] + " ");

        }
        System.out.println();



        int temp;
        int start = 0;
        int end = number.length-1;
        while (start<end){
            temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
        for (int j = 0; j < number.length; j++) {
            System.out.print( + number[j]+ " ");

        }





    }
}
