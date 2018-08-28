package ru.sinitsin.lesson7;

public class VendingMashineForTea extends VendingMashine{
    private String [] hotDrinks = new String[]{"Чай черный", "Чай зеленый", "Кофе"};

    @Override
    protected String getDrink(int key){
        return this.hotDrinks[key];
    }
}
