package org.example.arge;

public class CarSkeleton {
    String name;
    String description;

    public CarSkeleton(){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String  startEngine() {
        System.out.println("Classname is : " + getClass().getSimpleName());
        return getName() + " starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }

    // DOWNCASTING parametre olarak parent alıyor!
    protected void runEngine(CarSkeleton carSkeleton) {

        if(carSkeleton instanceof ElectricCar) {
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The engine is starting with electric. Per charge: " + avgKmPerCharge + " battery size: " + batterySize);
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("The engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize() + " cylinders :" + hybridCar.getCylinders());
        } else if ( carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("The engine is starting with GasPower. Per km: " + gasPoweredCar.getAverageKmPerLiter()  + " cylinders :" + gasPoweredCar.getCylinders());

        } else {
            System.out.println("Car type not found, invalid type!");
        }

    }


    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
