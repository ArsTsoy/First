package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
////        System.out.println(list);
//
//        ArrayList list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(sum(list));

//        Container<String, String> container = new Container<>();
//        container.setField("dasjnfk");
//        String field = container.getField();
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    private static <H> H sum(H h) {
        return h;
    }
}
