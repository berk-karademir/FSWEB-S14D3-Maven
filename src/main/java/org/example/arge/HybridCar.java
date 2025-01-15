package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double AvgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description,
                     double AvgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.AvgKmPerLiter = AvgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return AvgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
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
        return "run from Hybrid car";
    }
    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLitre=" + AvgKmPerLiter +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
