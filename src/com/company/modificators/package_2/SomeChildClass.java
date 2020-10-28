package com.company.modificators.package_2;

import com.company.modificators.package_1.SomeClass;

public class SomeChildClass extends SomeClass {

    public void someMethod() {
        publicInt = 10;
//        privateInt = 10;
//        defaultInt = 10;
        protectedInt = 10;
    }
}
