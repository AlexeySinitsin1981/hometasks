package ru.sinitsin.lesson25.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    Map<String,String> map = new HashMap<>();
    map.put("Вася", "Иванов");
    map.put("Петр", "Петров");
    map.put("Виктор", "Сидоров");
    map.put("Сергей","Савельев");
    map.put("Вадим","Викторов");
    //map.put("Виктор","Иванов"); //возвращает false


        System.out.println(map.size());


        System.out.println(MapUtils.isUnique(map));


    }

}
