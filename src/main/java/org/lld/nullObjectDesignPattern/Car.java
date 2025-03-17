package org.lld.nullObjectDesignPattern;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 70;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
}
