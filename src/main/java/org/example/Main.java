package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        // UPCASTING !!!
        Car ford = new Ford(6, "Ford Falcon");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        Car holden = new Holden(6, "Holden Commodore");

        printResult(car);
        br();
        printResult(ford);
        br();
        printResult(mitsubishi);
        br();
        printResult(holden);
        }

        // method that takes Object instance as parameter and print theirs class methods
        // it takes parent object as param
        public static void printResult (Car car){

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
        }

    public static void br(){
        System.out.println("-----------------------------------------------------------------");
    }
}