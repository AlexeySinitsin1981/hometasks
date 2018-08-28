package ru.sinitsin.lesson6;

public class Main {
    public static void main(String[] args) {
        //Tax t = new Tax();
        TaxForVillage t = new TaxForVillage();


        t.income = 1200000;
        t.legalForm = "ООО";
        t.taxRate = 0.06;

        double yourTax = t.sumTax();
        double tfv = t.onlyForVillage(yourTax);


        System.out.println("Сумма вашего налога равна: " + t.onlyForVillage(yourTax));



    }
}
