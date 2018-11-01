package ru.sinitsin.lesson19;

public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("|%-9s|%-12s|%9s|", "Привет!", "Я здесь!", "Халва"));
        double number = 1030;
        System.out.println(String.format("|%-9.1f|", number));
        System.out.printf("%-14s%-6s%-12s%-10s%n", "Наименование", "Цена", "Количество", "Стоимость");
        System.out.println("-----------------------------------------------------");

    }
}
