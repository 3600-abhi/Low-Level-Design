package org.example.nullObjectDesignPattern;

public class Bike implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 10;
    }

    @Override
    public int getSeatCapacity() {
        return 2;
    }
}
