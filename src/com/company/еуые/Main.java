package com.company.еуые;

import com.company.Animal;
import com.company.Cat;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void iterateAnimals(List<? super Animal> animals) {


//        for(Animal animal: animals) {
//
//            System.out.println("Еще один шаг в цикле пройден!");
//        }
    }

    public static void main(String[] args) {


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());


//ошибка компилятора!

//        iterateAnimals(cats);
    }
}
