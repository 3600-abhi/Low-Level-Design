package org.lld.nullObjectDesignPattern;

public class VehicleFactory {
    public static Vehicle getVehicleInstance(String vehicleType) {
        if ("CAR".equalsIgnoreCase(vehicleType)) {
            return new Car();
        } else if ("BIKE".equalsIgnoreCase(vehicleType)) {
            return new Bike();
        }

        return new NullVehicle();
    }
}
