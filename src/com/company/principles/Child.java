package com.company.principles;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    //Переопределение методов
    @Override
    public void someMethod() {
//        this <- текущий объект Child;
//        super <- обратись к объект родителю;
        super.someMethod();
        System.out.println("fasfibasfk");
    }
}
