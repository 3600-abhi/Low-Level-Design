package org.example.parkingLot_LLD.exceptions;

public class ParkingLotException extends RuntimeException {

    public ParkingLotException() {
    }

    public ParkingLotException(String message) {
        super(message);
    }
}
