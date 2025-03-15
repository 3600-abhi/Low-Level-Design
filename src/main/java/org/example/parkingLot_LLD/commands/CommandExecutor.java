package org.example.parkingLot_LLD.commands;

import org.example.parkingLot_LLD.OutputPrinter;
import org.example.parkingLot_LLD.model.Command;
import org.example.parkingLot_LLD.service.ParkingLotService;

public abstract class CommandExecutor {
    protected ParkingLotService parkingLotService;
    protected OutputPrinter outputPrinter;

    public CommandExecutor(final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        this.parkingLotService = parkingLotService;
        this.outputPrinter = outputPrinter;
    }

    public abstract boolean validate(Command command);

    public abstract void execute(Command command);
}
