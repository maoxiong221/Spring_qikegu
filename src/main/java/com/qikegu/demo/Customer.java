package com.qikegu.demo;

public class Customer {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello: "+ name);
    }
}

