package ru.sinitsin.Test.Parkovka;

public class Avto {
    String model;
    String color;
    int gosNomer;



    public Avto(){

    }

    public Avto(String model) {
        this.model = model;
    }

    public Avto(String model, String color, int gosNomer) {
        this.model = model;
        this.color = color;
        this.gosNomer = gosNomer;
    }
}
