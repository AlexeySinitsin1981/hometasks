package ru.sinitsin.lesson7;

public class VendingMashine {
    private double money = 0;
    private String [] drinks = new String[]{"Кока-Кола", "Спрайт", "Фанта"};

    public void addMoney(double money){
        this.money=money;

    }
    protected String getDrink(int key){
        return this.drinks[key];
    }
    public void giveMeADrink(int key){
        if(this.money>0){
            if(key>this.drinks.length){
                System.out.println("Такого напитка нет!");
            }else {
                String drink = getDrink(key);
                System.out.println("Возьмите ваш напиток: "+ drink);
            }
        }else{
            System.out.println("Бесплатно не работаем!");
        }

    }
}
