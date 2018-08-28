package ru.sinitsin.lesson6;

public class Tax {
    public double income;
    //public String legalForm = new String[] {"ИП", "ООО", "ОАО", "ФГУП"};
    protected String legalForm;
    public double taxRate;


    public double sumTax() {
        if ((income > 100000) & (income < 500000)) {
            return income * 0.06;
        } else if ((income > 500000) & (income < 1000000)) {
            return income * 0.13;
        } else if (income > 1000000) {
            return income * 0.20;
        }else{
           return income*0;
        }

    }
}
