package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    /*2 parametreli constructor(name ve silindir sayısını set etmeli) çünkü tekerlek sayısı ve motoru var
    tüm carlar için ortak özellik ama bu iki özellik default olarak set edilecek parametre almaya ihtiyaç
     duymadan parametreden bağımsız. sabit gibi */

    public Car (int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    /* ||
 @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return  this.cylinders == car.cylinders && this.name.equals(car.name);
    }
 */
    //methods
    private void extracted() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }

    public String startEngine() {
        extracted();
        return "the car's engine is starting";
    }


    public String accelerate() {
        extracted();
        return "the car is accelerating";
    }

    public String brake() {
        extracted();
        return "the car is braking";
    }


}
