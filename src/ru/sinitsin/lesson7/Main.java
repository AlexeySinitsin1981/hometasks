package ru.sinitsin.lesson7;

public class Main {
    public static void main(String[] args) {

        String [] drinks = new String[]{"Кока-Кола", "Спрайт", "Фанта"};

        VendingMashine vm = new VendingMashine();
        vm.addMoney(1000);
        vm.giveMeADrink(HotDrink.CACAO);

       // vm.setDrinks(new String [] {"Чай", "Кофе", "Какао"});
       // vm.addMoney(100);
       // vm.giveMeADrink(1);

        /*VendingMashineForTea vmft = new VendingMashineForTea();
        vmft.addMoney(150);
        vmft.giveMeADrink(2);*/

        //System.out.println(Season.AUTUMN);

        /*Season currentlySeason = Season.SPRING;
        if (currentlySeason==Season.SPRING){
            System.out.println("Сегодня весна");
        }else{
            System.out.println("Сеголня не весна");
        }*/

    }
}
