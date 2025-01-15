package org.example.arge;

import org.example.company.Car;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("TOGG","YvM :D", 400,500);
        CarSkeleton hybridCar = new HybridCar("Toyota", "falan model",50,800,8);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Tofaş","Doğan SLX Uçan demir yığını", 35, 2);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }
    public static void startEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
    }

}
