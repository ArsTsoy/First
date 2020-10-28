package com.company.modificators.package_2;

import com.company.modificators.package_1.SomeClass;

public class Main2 {

    public static void main(String[] args) {
        SomeClass objInAnotherPackage = new SomeClass();
        objInAnotherPackage.publicInt = 1;
//        objInAnotherPackage.defaultInt = 1;
//        objInAnotherPackage.protectedInt = 1;
    }
}
