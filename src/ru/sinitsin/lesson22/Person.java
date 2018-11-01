package ru.sinitsin.lesson22;

import ru.sinitsin.lesson22.PersonSuperComparator;
import ru.sinitsin.lesson22.PersonNameComparator;

import java.util.Collections;
import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person psc1 = new Person("Sandra", 26);
        Person psc2 = new Person("Magda", 79);
        Person psc3 = new Person("Viktoriya", 19);
        Person psc4 = new Person("Luciya", 35);
        Person[]array = new Person[4];
        array[0] = psc1;
        array[1] = psc2;
        array[2] = psc3;
        array[3] = psc4;





        for (Person person:array) {
            System.out.println(person);

        }

    }


}
