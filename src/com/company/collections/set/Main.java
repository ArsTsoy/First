package com.company.collections.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Madina");
//        names.add("Arlan");
//        names.add("Ruslan");
//        names.add("Denis");
//        names.add("Masha");
//        names.add("Madina");
//
//        System.out.println("list: " + names);
//
//        Set<Integer> names2 = new TreeSet<>();
//        names2.add(10);
//        names2.add(8);
//        names2.add(11);
//        names2.add(3);
//        names2.add(2);
//        names2.add(1);
//        System.out.println("set: " + names2);
//
//        Iterator<Integer> names2Iterator = names2.iterator();
//        while (names2Iterator.hasNext()) {
//            System.out.println(names2Iterator.next());
//        }

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat(10));
        cats.add(new Cat(1));
        cats.add(new Cat(3));
        cats.add(new Cat(9));
        cats.add(new Cat(7));
        cats.add(new Cat(2));
        cats.add(new Cat(1));

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
