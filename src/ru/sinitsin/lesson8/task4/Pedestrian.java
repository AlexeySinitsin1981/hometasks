package ru.sinitsin.lesson8.task4;

public class Pedestrian {
    private String growth;
    private String skinColor;
    private int age;
    private static int counter = 0;

    public Pedestrian() {
        counter++;

    }

    public Pedestrian(String growth, String skinColor, int age) {
        this.growth = growth;
        this.skinColor = skinColor;
        this.age = age;
        counter++;

    }

    @Override
    public String toString() {
        return "Pedestrian{" +
                "growth='" + growth + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", age=" + age +
                '}';
    }

    public static int getCounter() {
        return counter;
    }
}
