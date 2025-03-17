package org.lld.parkingLot_LLD.commands;

import org.lld.parkingLot_LLD.OutputPrinter;
import org.lld.parkingLot_LLD.model.Command;
import org.lld.parkingLot_LLD.service.ParkingLotService;

public class ExitCommandExecutor extends CommandExecutor {
    public static String COMMAND_NAME = "exit";

    public ExitCommandExecutor(final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }

    @Override
    public boolean validate(final Command command) {
        return command.getParams().isEmpty();
    }

    @Override
    public void execute(final Command command) {
        outputPrinter.end();
    }
}
