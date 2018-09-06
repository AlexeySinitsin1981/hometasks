package ru.sinitsin.lesson7;

public enum Season {
    WINTER("Зима", 1), SPRING("Весна", 2), SUMMER("Лето", 3), AUTUMN("Осень", 4);

    public String name;
    public int position;

    Season(String name, int position) {
        this.name = name;
        this.position = position;
    }
}
