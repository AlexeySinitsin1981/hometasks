package ru.sinitsin.lesson9.task3;

public class SportPerson extends Person {


    @Override
    public void run() {
        System.out.println("Быстро бегу!");
    }

    @Override
    public void swim() {
        System.out.println("Быстро плыву!");
    }
}
