package org.example.CustomObjectComparison;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Person> li = new ArrayList<>();

        li.add(new Person("Ali", 35));
        li.add(new Person("Veli", 25));
        li.add(new Person("Hasan", 27));

        //OCP and DIP satisfied.
        li.sort(new PersonComparatorByAge()); // comparing by age
        System.out.println("Sorted by Age: " + li);

        li.sort(new PersonComparatorByName()); // comparing by name
        System.out.println("Sorted by Name: " + li);
        }
    }