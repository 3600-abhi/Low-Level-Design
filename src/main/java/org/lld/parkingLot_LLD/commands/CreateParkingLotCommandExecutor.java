package org.lld.parkingLot_LLD.commands;


import org.lld.parkingLot_LLD.OutputPrinter;
import org.lld.parkingLot_LLD.model.Command;
import org.lld.parkingLot_LLD.model.ParkingLot;
import org.lld.parkingLot_LLD.service.ParkingLotService;
import org.lld.parkingLot_LLD.strategy.NaturalOrderParking;
import org.lld.parkingLot_LLD.validator.IntegerValidator;

import java.util.List;

public class CreateParkingLotCommandExecutor extends CommandExecutor {

    public static String COMMAND_NAME = "create_parking_lot";

    public CreateParkingLotCommandExecutor(final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }


    @Override
    public boolean validate(final Command command) {
        final List<String> params = command.getParams();
        if (params.size() != 1) {
            return false;
        }
        return IntegerValidator.isInteger(params.get(0));
    }


    @Override
    public void execute(final Command command) {
        final int parkingLotCapacity = Integer.parseInt(command.getParams().get(0));
        final ParkingLot parkingLot = new ParkingLot(parkingLotCapacity);
        parkingLotService.createParkingLot(parkingLot, new NaturalOrderParking());

        outputPrinter.printWithNewLine("Created a parking lot with " + parkingLot.getCapacity() + " slots");
    }
}