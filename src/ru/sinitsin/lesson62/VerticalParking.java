package ru.sinitsin.lesson62;

public class VerticalParking {
    int amountCar;
    String [] nameCar = new String[]{"VAZ", "GAZ", "UAZ", "LADA"};
    int payment = 100;
    int hours;
    boolean paymentReceived;

    public void sum (double paymentForHours){
        double paymentForHour = payment/hours;
        if(paymentForHour<100){
            boolean paymentReceived =true;
        }else {
            boolean paymentReceived = false;
        }

    }

    public String getCar(int numberCarParking){

        return this.nameCar[numberCarParking];
    }



    public void returnCar(boolean paymentReceived){
        if(true){

            //String nameC = getCar(numberCarParking);

            System.out.println("Ждите свой автомобиль!");
        }else{
            System.out.println("Подкинь деньжат :(");
        }
    }
}
