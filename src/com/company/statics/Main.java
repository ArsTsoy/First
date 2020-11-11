package com.company.statics;

public class Main {

    public static void main(String[] args) {
        SomeClass obj1 = new SomeClass();
        obj1.nonStaticInt = 1;
        obj1.staticInt = 1;

        SomeClass.staticInt = 10;
//        SomeClass.nonStaticInt = 10;

        SomeClass.someMethod();

        SomeClass obj2 = new SomeClass();
        obj2.nonStaticInt = 2;


        System.out.println("1) " + obj1);
        System.out.println("2) " + obj2);
    }
}
