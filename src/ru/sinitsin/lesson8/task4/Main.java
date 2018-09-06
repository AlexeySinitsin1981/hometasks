package ru.sinitsin.lesson8.task4;

public class Main {
    public static void main(String[] args) {
        Pedestrian ped = new Pedestrian("Высокий", "Белый", 32);
        Pedestrian ped2 = new Pedestrian("Лилипут", "Желтый", 12);
        Pedestrian ped3 = new Pedestrian("Дылда", "Черный", 27);

        System.out.println("Коичество пешеходов прошедших мимо нас: " + Pedestrian.getCounter());
    }
}
