package com.company.еуые;

import com.company.Animal;
import com.company.Cat;
import com.company.Test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void iterateAnimals(Collection<? extends Animal> animals) {
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Test> tests = new ArrayList<>();
//ошибка компилятора!
        iterateAnimals(cats);
        iterateAnimals(tests);
    }

}
