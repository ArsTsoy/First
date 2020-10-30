package com.company.oop_tasks.task1;

import java.io.Serializable;

public class MainInAnotherComputer {

    private Serializable receivableInstance;

    public void receiveAnotherObject(Serializable serializable) {
        receivableInstance = (Phone) serializable ;
    }
}
