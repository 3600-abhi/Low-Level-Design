package org.example.nullObjectDesignPattern;

public class NullDesignPatternExample {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleInstance("CAR");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Tank Capacity :: " + vehicle.getTankCapacity());
        System.out.println("Seat Capacity :: " + vehicle.getSeatCapacity());
    }
}
