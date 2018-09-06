package ru.sinitsin.Test.Parkovka;

public class Zdanie {
    String name;
    int floor;
    int cost;

    public Zdanie(){

    }


    public Zdanie(String name, int floor, int cost) {
        this.name = name;
        this.floor = floor;
        this.cost = cost;
    }

    public void obslujivanie(String model){
        if(model.equals("MAZ")|| model.equals("VAZ")){
            System.out.println("Ваша машина припаркована на 2 этаже парковочного комплекса " + this.name);
        }else{
            System.out.println("Паркуй на улице свой велосипед!");
        }

    }
}
