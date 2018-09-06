package ru.sinitsin.lesson7;

public enum HotDrink {
    TEA("Чай",100), COFFEE("Кофе", 200), CACAO("Какао", 150);
    public String title;
    public int price;

    HotDrink(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
