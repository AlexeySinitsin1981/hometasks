package ru.sinitsin.lesson22;

public class PersonNameComparator extends PersonSuperComparator {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
