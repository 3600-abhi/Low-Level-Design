package org.lld.parkingLot_LLD.commands;

import org.lld.parkingLot_LLD.OutputPrinter;
import org.lld.parkingLot_LLD.model.Car;
import org.lld.parkingLot_LLD.model.Command;
import org.lld.parkingLot_LLD.model.Slot;
import org.lld.parkingLot_LLD.service.ParkingLotService;

import java.util.List;

public class StatusCommandExecutor extends CommandExecutor {
    public static String COMMAND_NAME = "status";

    public StatusCommandExecutor(final ParkingLotService parkingLotService,
                                 final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }


    @Override
    public boolean validate(final Command command) {
        return command.getParams().isEmpty();
    }


    @Override
    public void execute(Command command) {
        final List<Slot> occupiedSlots = parkingLotService.getOccupiedSlots();

        if (occupiedSlots.isEmpty()) {
            outputPrinter.parkingLotEmpty();
            return;
        }

        outputPrinter.statusHeader();

        for (Slot slot : occupiedSlots) {
            final Car parkedCar = slot.getParkedCar();
            final String slotNumber = slot.getSlotNumber().toString();

            outputPrinter.printWithNewLine(padString(slotNumber, 12)
                    + padString(parkedCar.getRegistrationNo(), 19) + parkedCar.getColor());
        }
    }

    private static String padString(final String word, final int length) {
        String newWord = word;
        for (int count = word.length(); count < length; count++) {
            newWord = newWord + " ";
        }
        return newWord;
    }
}
