package com.company.oop_tasks.task1;

import java.io.Serializable;

public class Phone implements Serializable {

    //region FIELDS
    private String phoneNumber;
    private String model;
    private double weight;
    //endregion

    //region Constructors
    public Phone(String phoneNumber, String model, double weight) {
        this(phoneNumber, model);
        this.weight = weight;
    }

    public Phone(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public Phone() {
    }
    //endregion

    //region Getters/Setters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //endregion

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит: " + name + " (" + phoneNumber + ")");
    }

//    public void sendMessage(String[] phoneNumbers) {
//        phoneNumbers[0] = "das";
//        for (int i = 0; i < phoneNumbers.length; i++) {
//            System.out.println(phoneNumbers[i]);
//        }
//    }

    public void sendMessage(String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            System.out.println(phoneNumbers[i]);
        }
    }
//

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Phone) {
            if (obj == this) {
                return true;
            } else {
                Phone anotherPhone = (Phone) obj;
                if(anotherPhone.model.equals(this.model)) {
                    if(anotherPhone.weight == this.weight) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public String toString() {
        return "Phone " +
                "{phoneNumber = " + phoneNumber +
                ", model = " + model +
                ", weight = " + weight
                + "}";
    }
}

