package ru.sinitsin.lesson7;

public class Main {
    public static void main(String[] args) {
        VendingMashine vm = new VendingMashine();
        vm.addMoney(100);
        vm.giveMeADrink(1);

        VendingMashineForTea vmft = new VendingMashineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(2);
    }
}
