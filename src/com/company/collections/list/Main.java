package com.company.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        LinkedList<Car> linkedList = new LinkedList<>();
        linkedList.add(new Car("asf"));
        // [A, B, C] -> Node(A), Node(B), Node(C)
        // Node(A) -
        //         prev = null
        //         next = Node(B)

        // Node(A) -
        //         prev = Node(A)
        //         next = Node(C)

        list.add(new Car("fasf")); //[A]
        list.add(new Car("fasf")); //[A, B]
        list.add(new Car("Audi")); //[A, B, C]
//        System.out.println(list.get(list.indexOf(new Car("Audi"))));

//        System.out.println(list.contains(new Car("Audi")));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("A");
        list2.add("E");
        list2.add("A");
        list2.add("F");
//        System.out.println(list2);
//        list2.remove("A");

//        System.out.println(list2);
//        System.out.println("BEFORE REMOVE");
//        System.out.println(list2);//[A, B, C, D, A ...]
//        list2.remove(0); //[B, C, D, A ...]
//        list2.remove(1); //[B, D, A ...]
//
//        System.out.println("AFTER REMOVE");
//        System.out.println(list2);

//        System.out.println("BEFORE CLEAR");
//        System.out.println(list2);
//        list2.clear();
//
//        System.out.println("AFTER CLEAR");
//        System.out.println(list2);

//        System.out.println(list2.indexOf("A"));
//        System.out.println(list2.lastIndexOf("A"));

//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

        // ITERATOR
//        Iterator<String> iterator = list2.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // FOREACH
        int[] mass = new int[] {10, 12, 67, 98, 34, 25, 45};
        for(int element: mass) {
            System.out.println(element);
        }


    }
}
