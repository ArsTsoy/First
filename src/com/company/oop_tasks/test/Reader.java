package com.company.oop_tasks.test;

public class Reader {

    private String name;
    private String lastName;

    public void returnBook(int counter) {
        System.out.println(template(counter, true));
    }

    public void takeBook(int counter) {
        System.out.println(template(counter, false));
    }

    private String template(int counter, boolean isReturn) {
        if(isReturn) {
            return lastName + " " + name + " вернул " + counter + " книги";
        } else {
            return lastName + " " + name + " взял " + counter + " книги";
        }
    }
}
