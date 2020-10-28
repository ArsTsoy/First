package com.company.new_test;

public class NewClass {
    private String t;

    public NewClass(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "t='" + t + '\'' +
                '}';
    }
}
