package com.company.statics;

public class SomeClass {

    public static int staticInt;
    public int nonStaticInt;

    static void someMethod() {
        nonStaticInt = 10;
        staticInt = 10;
    }

    @Override
    public String toString() {

        return "SomeClass{" +
                "nonStaticInt=" + nonStaticInt +
                ", staticInt=" + staticInt +
                '}';
    }
}
