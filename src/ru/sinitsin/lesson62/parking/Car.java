package ru.sinitsin.lesson62.parking;

public class Car {
    private int gosNumber;
    private String model;
    private Color color;
    private Type type;



    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(int gosNumber) {
        this.gosNumber = gosNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
