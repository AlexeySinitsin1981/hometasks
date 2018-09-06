package ru.sinitsin.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        Chiken chiken = new Chiken("Птица", 1, 5, 0);
        Dog dog = new Dog("Собака",3, 15, 30);
        Cat cat = new Cat("Кошка", 7, 9, 1.7);

       /*chiken.getName();
       dog.getName();
       cat.getName();*/
       chiken.canRun();
       dog.canSwim();
       dog.canRun();
       cat.canFly();


    }
}
