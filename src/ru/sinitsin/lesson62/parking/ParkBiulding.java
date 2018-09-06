package ru.sinitsin.lesson62.parking;

public class ParkBiulding {
    private String name;
    private Type type;
    //private Car[] cars;

    public ParkBiulding(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Type getType() {

        return type;
    }

    public void setType(Type type) {

        this.type = type;
    }

    /*public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }*/



}
