package ru.sinitsin.Test.Parkovka;

public class Main {
    public static void main(String[] args) {
        Zdanie zdanie = new Zdanie();
        zdanie.name = "Огонек";

        Avto avto1 = new Avto("MAZ", "BLUE", 2395);
        Avto avto2 = new Avto("VAZ", "RED", 4174);
        Avto avto3 = new Avto("Harley Davidson", "BLACK", 9402);

        //avto1.model.equals("MAZ")

        zdanie.obslujivanie("VAZ");



    }
}

