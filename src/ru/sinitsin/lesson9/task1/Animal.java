package ru.sinitsin.lesson9.task1;

public abstract class Animal {
    private String name;
    private int age;
    private double weidht;

    public Animal(String name, int age, double weidht) {
        this.name = name;
        this.age = age;
        this.weidht = weidht;
    }

    public String getName() {
      //  System.out.println("Я животное: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeidht() {
        return weidht;
    }

    public void setWeidht(double weidht) {
        this.weidht = weidht;
    }


}
