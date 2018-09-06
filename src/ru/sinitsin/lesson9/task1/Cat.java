package ru.sinitsin.lesson9.task1;

public class Cat extends Animal implements Fly{
    private double heightJump;

    public Cat(String name, int age, double weidht, double heightJump) {
        super(name, age, weidht);
        this.heightJump = heightJump;
    }

    public double getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(double heightJump) {
        this.heightJump = heightJump;
    }

    @Override
    public void canFly() {
        System.out.println("Я "+ getName() + " я могу бегать!");
    }
}
