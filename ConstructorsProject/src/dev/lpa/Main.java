package dev.lpa;

import external.Child;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent( "John Doe", "01/01/1900", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);

        Person joe = new Person("Joe", "01-01-1950");
        System.out.println(joe);

        Person joeCopy = new Person(joe);
        System.out.println(joeCopy);

//        Generation g;
        Generation g = Generation.BABY_BOOMER;

    }
}
