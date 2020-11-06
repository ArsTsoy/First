package com.company.generics;

public class Container <T, K> {

    private T field;
    private K field2;

    public K getField2() {
        return field2;
    }

    public void setField2(K field2) {
        this.field2 = field2;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    private static <H> int sum(H h) {
        return 1;
    }
}
