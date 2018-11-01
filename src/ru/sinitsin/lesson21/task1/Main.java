package ru.sinitsin.lesson21.task1;

public class Main {
    public static void main(String[] args) {
        int [][] two = new int[3][3];
        two [0][0] = 1;
        two [0][1] = 2;
        two [0][2] = 3;
        two [1][0] = 4;
        two [1][1] = 5;
        two [1][2] = 6;
        two [2][0] = 7;
        two [2][1] = 8;
        two [2][2] = 9;

        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[i].length-1; j++) {
                System.out.print(two[i][j] + " ");

            }
        }


    }
}

