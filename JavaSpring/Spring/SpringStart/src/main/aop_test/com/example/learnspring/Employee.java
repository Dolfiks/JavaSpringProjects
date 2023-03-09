package com.example.learnspring;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Employee {

    private Vehicle vehicle;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void infovehicle(){
        System.out.println("This " + getName() + " have :");
        vehicle.invehicle();
    }
}
