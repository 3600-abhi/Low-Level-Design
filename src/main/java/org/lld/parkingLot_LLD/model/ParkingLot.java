package org.lld.parkingLot_LLD.model;

import org.lld.parkingLot_LLD.exceptions.InvalidSlotException;
import org.lld.parkingLot_LLD.exceptions.ParkingLotException;
import org.lld.parkingLot_LLD.exceptions.SlotAlreadyOccupiedException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private static final int MAX_CAPACITY = 10000;
    private final int capacity;
    private final Map<Integer, Slot> slots;

    public ParkingLot(final int capacity) {
        if (capacity > MAX_CAPACITY || capacity <= 0) {
            throw new ParkingLotException("Invalid capacity given for parking lot");
        }

        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

    public int getCapacity() {
        return capacity;
    }


    public Map<Integer, Slot> getSlots() {
        return slots;
    }


    private Slot getSlot(final Integer slotNumber) {
        if (slotNumber > capacity || slotNumber <= 0) {
            throw new InvalidSlotException();
        }

        if (!slots.containsKey(slotNumber)) {
            slots.put(slotNumber, new Slot(slotNumber));
        }

        return slots.get(slotNumber);
    }


    public Slot park(final Car car, final Integer slotNumber) {
        final Slot slot = getSlot(slotNumber);

        if (!slot.isSlotFree()) {
            throw new SlotAlreadyOccupiedException();
        }

        slot.assignCar(car);
        return slot;
    }


    public Slot makeSlotFree(final Integer slotNumber) {
        final Slot slot = getSlot(slotNumber);
        slot.unassignCar();
        return slot;
    }
}
