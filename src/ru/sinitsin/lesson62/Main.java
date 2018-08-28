package ru.sinitsin.lesson62;
import ru.sinitsin.lesson62.VerticalParking;


// этот код не работает, смотри lesson6

public class Main {
    public static void main(String[] args) {
        VerticalParking vp = new VerticalParking();
        //vp.returnCar(true);
        vp.hours=5;
        vp.payment= 500;
        vp.getCar( 1);
    }
}
