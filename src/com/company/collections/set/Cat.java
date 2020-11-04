package com.company.collections.set;

import org.w3c.dom.ls.LSOutput;

public class Cat implements Comparable {

    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        // НЕ ВАЖНО конкретное число

        // ВАЖНО: положительное/отрицательное число
        // положительное - another стоит первее, чем this
        // отрицательное - this стоит первее, чем another

        Cat anotherCat = (Cat)o;
        return this.age - anotherCat.getAge();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
