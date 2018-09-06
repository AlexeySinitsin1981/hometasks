package ru.sinitsin.lesson9.task1;

public class Chiken extends Animal implements Run{
    private double flightAltitude;

    public Chiken(String name, int age, double weidht, double flightAltitude) {
        super(name, age, weidht);
        this.flightAltitude = flightAltitude;
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(double flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void canRun() {
        System.out.println("Я "+ getName() + " я не могу летать!");
    }
}
