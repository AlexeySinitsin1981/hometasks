package ru.sinitsin.lesson8.task5;

public class Main {
    public static void main(String[] args) {
        String[] list = {"Молоко", "Хлеб"};
        Contract contr = new Contract(2398, 12041989, list);
        Act act = Converter.convert(contr);

       // System.out.println(act);
        //System.out.println(act.toString());
        System.out.println(act.getNumberAct());
    }
}
