package ru.sinitsin.lesson9.task1;

public class Dog extends Animal implements Swim, Run{
    private int runningSpeed;

    public Dog(String name, int age, double weidht, int runningSpeed) {
        super(name, age, weidht);
        this.runningSpeed = runningSpeed;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    @Override
    public void canSwim() {
        System.out.print("Я "+ getName() + " я могу плавать");
    }


    @Override
    public void canRun() {
        System.out.println(" и бегать!");
    }
}
