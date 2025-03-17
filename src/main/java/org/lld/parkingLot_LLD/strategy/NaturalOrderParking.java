package org.lld.parkingLot_LLD.strategy;

import java.util.TreeSet;

public class NaturalOrderParking implements ParkingStrategy {
    private final TreeSet<Integer> slotTreeSet;

    public NaturalOrderParking() {
        this.slotTreeSet = new TreeSet<>();
    }

    @Override
    public void addSlot(Integer slotNumber) {
        this.slotTreeSet.add(slotNumber);
    }

    @Override
    public void removeSlot(Integer slotNumber) {
        this.slotTreeSet.remove(slotNumber);
    }

    @Override
    public Integer getNextSlot() {
        return this.slotTreeSet.first();
    }
}
