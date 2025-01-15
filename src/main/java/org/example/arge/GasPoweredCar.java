package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double AverageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double AverageKmPerLiter, int cylinders) {
        super(name, description);
        this.AverageKmPerLiter = AverageKmPerLiter;
        this.cylinders = cylinders;
    }


    public double getAverageKmPerLiter() {
        return AverageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting.";
    }

    @Override
    public String drive() {
        return "run from GasPoweredCar car";
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + AverageKmPerLiter +
                ", cylinders=" + cylinders +
                '}';
    }
}
