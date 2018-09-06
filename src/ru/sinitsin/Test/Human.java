package ru.sinitsin.Test;

public class Human {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Lida";
        person1.age = 25;
        person1.speak();
        person1.sayHello();


    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println("Привет! Меня зовут "+ name +" и мне " + age + " лет");
    }
    void sayHello(){
        System.out.println("Привет! Ау!!!");
    }


}