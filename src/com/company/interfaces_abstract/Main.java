package com.company.interfaces_abstract;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        someMethod(human);

        Turtle turtle = new Turtle();
        someMethod(turtle);
    }

    private static void someMethod(Showable showable) {
        System.out.println("fshbfjaskf");
        showable.show();
        System.out.println("fasjhbfknaslmkfs Fagsbfjh asfakns f");
    }

}
