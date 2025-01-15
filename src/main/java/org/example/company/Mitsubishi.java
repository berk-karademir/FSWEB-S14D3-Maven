package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return getName() + " engine is starting";
    }

    public String accelerate() {
        return getName() + " the car is accelerating";

    }

    public String brake() {
        return getName() + " is braking";
    }

}
