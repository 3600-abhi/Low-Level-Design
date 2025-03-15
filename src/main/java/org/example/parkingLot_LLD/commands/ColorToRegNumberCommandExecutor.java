package org.example.parkingLot_LLD.commands;

import org.example.parkingLot_LLD.OutputPrinter;
import org.example.parkingLot_LLD.model.Command;
import org.example.parkingLot_LLD.model.Slot;
import org.example.parkingLot_LLD.service.ParkingLotService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Executor to get all registration number of vehicles based on color
 */
public class ColorToRegNumberCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "registration_numbers_for_cars_with_colour";

    public ColorToRegNumberCommandExecutor(final ParkingLotService parkingLotService, final OutputPrinter outputPrinter) {
        super(parkingLotService, outputPrinter);
    }


    @Override
    public boolean validate(final Command command) {
        return command.getParams().size() == 1;
    }


    @Override
    public void execute(final Command command) {
        final List<Slot> slotsForColor = parkingLotService.getSlotsForColor(command.getParams().get(0));
        if (slotsForColor.isEmpty()) {
            outputPrinter.notFound();
        } else {
            final String result =
                    slotsForColor.stream()
                                 .map(slot -> slot.getParkedCar().getRegistrationNo())
                                 .collect(Collectors.joining(", "));
            outputPrinter.printWithNewLine(result);
        }
    }

}
