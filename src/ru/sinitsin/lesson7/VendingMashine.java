package ru.sinitsin.lesson7;

public class VendingMashine {
    private double money = 0;
    //private String [] drinks;
    private HotDrink drinks;


    public VendingMashine(){

    }

    public VendingMashine(HotDrink drinks) {
        this.drinks = drinks;
    }

    public void addMoney(double money){
        this.money=money;

    }
    /*protected String getDrink(HotDrink drinks){
        return this.drinks[key];
    }*/

    public void giveMeADrink(HotDrink drink){
        if(this.money>0){
            if(this.money>=drink.price){
                System.out.println("Возьмите ваш напиток: "+ drink.title);
            }else {
                //String drink = getDrink(key);
                System.out.println("Недостаточно средств! ");
            }
        }else{
            System.out.println("Бесплатно не работаем!");
        }
    }

    public void giveMeADrink(ColdDrink drink){
        if(this.money>0){
            if(this.money>=drink.price){
                System.out.println("Возьмите ваш напиток: "+ drink.title);
            }else {
                //String drink = getDrink(key);
                System.out.println("Недостаточно средств! ");
            }
        }else{
            System.out.println("Бесплатно не работаем!");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
