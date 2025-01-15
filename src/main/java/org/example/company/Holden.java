package org.example.company;

import java.util.concurrent.RecursiveTask;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
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
