package ru.sinitsin.lesson62;
import ru.sinitsin.lesson62.VerticalParking;
import ru.sinitsin.lesson62.parking.Car;
import ru.sinitsin.lesson62.parking.Color;
import ru.sinitsin.lesson62.parking.ParkBiulding;
import ru.sinitsin.lesson62.parking.Type;


// этот код не работает, смотри lesson6

public class Main {
    public static void main(String[] args) {
        /*Car car = new Car();
        car.setColor(Color.BLUE);
        ParkBiulding pb = new ParkBiulding("ВАЗ");
        pb.setName("Вымпел");
        Car[] cars = {car};*/



        Car car1 = new Car();
        car1.setColor(Color.RED);
        car1.setType(Type.LIGHT);
        car1.setModel("VAZ");
        car1.setGosNumber(4590);

        Car car2 = new Car();
        car2.setColor(Color.YELLOW);
        car2.setType(Type.HARD);
        car2.setModel("MAZ");
        car2.setGosNumber(2173);

        Car car3 = new Car();
        car3.setColor(Color.BLUE);
        car3.setType(Type.MOTO);
        car3.setModel("Harley Davidson");
        car3.setGosNumber(4912);

        ParkBiulding pk1 = new ParkBiulding("Вымпел");
        pk1.setType(Type.HARD);

        ParkBiulding pk2 = new ParkBiulding("Звезда");
        pk2.setType(Type.LIGHT);


       /* String Parking(String typeMachine){
            int carNumber;
            /*if(Type.HARD.equals()){
            }*/
           /* if (car1.equals(Type.HARD);){
                System.out.println("Грузовик не залезет!");
            }else{
                System.out.println("Добро пожаловать на верзний этаж!");
            }*/

        }
    }

