package com.company.interfaces_abstract;

public class Human implements Showable {
    //region HIDDEN
    private String name;
    private int age;

    public Human() { }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //endregion

    @Override
    public void show() {
        System.out.println("I'm human. Hello, everyone!");
    }

}
