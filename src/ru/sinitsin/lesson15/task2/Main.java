package ru.sinitsin.lesson15.task2;

public class Main {
    public static void main(String[] args) {
        //count(3);

        System.out.println(fac(4));
    }

    /*public static void count (int n){
        System.out.println(n);

        if(n==-5)
            return;;
            count(n-1);

    }*/

    public static int fac (int n){
        if(n==1)
            return 1;

        return n*fac(n-1);


    }

}
