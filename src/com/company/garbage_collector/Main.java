package com.company.garbage_collector;

import com.company.Cat;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Total memory before: " + Runtime.getRuntime().totalMemory());
//        System.out.println("Free memory before: " + Runtime.getRuntime().freeMemory());
//        List<String> list = new LinkedList<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            list.add("str");
//        }
//        System.out.println("Total memory after: " + Runtime.getRuntime().totalMemory());
//        System.out.println("Free memory after: " + Runtime.getRuntime().freeMemory());


//        Scanner scanner = new Scanner(System.in);
//        String s = "";
//        Cat cat = new Cat();
//        cat.toString();

        String ob1 = new String("asfa");
        ob1 = null;
        ob1 = new String("fasf");

        System.out.println(ob1.length());
        System.out.println(ob1);

        SoftReference<String> ref = new SoftReference<String>(new String("fasf"));
        String s = ref.get();



    }
}
