package ru.sinitsin.lesson9.task3;

public class Main {
    public static void main(String[] args) {
        Person person = new SportPerson();
        Person child = new Children();

        person.run();
        person.swim();

        child.swim();
        child.run();


    }
}