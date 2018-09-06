package ru.sinitsin.lesson7;

public enum ColdDrink {
    TEA("Кола",50), COFFEE("Фанта", 50), CACAO("Спрай", 50);
    public String title;
    public int price;

    ColdDrink(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
