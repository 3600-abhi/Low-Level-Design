package org.lld.parkingLot_LLD;

import org.lld.parkingLot_LLD.commands.CommandExecutorFactory;
import org.lld.parkingLot_LLD.exceptions.InvalidModeException;
import org.lld.parkingLot_LLD.mode.FileMode;
import org.lld.parkingLot_LLD.mode.InteractiveMode;
import org.lld.parkingLot_LLD.service.ParkingLotService;

import java.io.IOException;

public class ParkingLotExample {
    public static void main(String[] args) throws IOException {
        final OutputPrinter outputPrinter = new OutputPrinter();
        final ParkingLotService parkingLotService = new ParkingLotService();
        final CommandExecutorFactory commandExecutorFactory = new CommandExecutorFactory(parkingLotService);

        if (isInteractiveMode(args)) {
            new InteractiveMode(commandExecutorFactory, outputPrinter).process();
        } else if (isFileInputMode(args)) {
            new FileMode(commandExecutorFactory, outputPrinter, args[0]).process();
        } else {
            throw new InvalidModeException();
        }
    }


    private static boolean isFileInputMode(final String[] args) {
        return args.length == 1;
    }


    private static boolean isInteractiveMode(final String[] args) {
        return args.length == 0;
    }
}
