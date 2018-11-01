package ru.sinitsin.lesson24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("foo");
        setString.add("buzz");
        setString.add("bar");
        setString.add("fork");
        setString.add("bort");
        setString.add("spoon");
        setString.add("!");
        setString.add("dude");

        System.out.println(setString);



        /*if(setString.size()%2==1){
            System.out.println(setString);
        }else{
            System.out.println(setString);
        }*/

        for (Iterator<String> iter = setString.iterator(); iter.hasNext(); ) {
            String element = iter.next();
            if(element.length()%2==1) {

                System.out.print(element+" ");
            }
        }




    }
}
