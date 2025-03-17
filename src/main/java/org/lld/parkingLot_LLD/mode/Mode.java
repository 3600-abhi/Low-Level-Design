package org.lld.parkingLot_LLD.mode;

import org.lld.parkingLot_LLD.OutputPrinter;
import org.lld.parkingLot_LLD.commands.CommandExecutor;
import org.lld.parkingLot_LLD.commands.CommandExecutorFactory;
import org.lld.parkingLot_LLD.exceptions.InvalidCommandException;
import org.lld.parkingLot_LLD.model.Command;

import java.io.IOException;

public abstract class Mode {
    private final CommandExecutorFactory commandExecutorFactory;
    protected OutputPrinter outputPrinter;

    public Mode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter) {
        this.commandExecutorFactory = commandExecutorFactory;
        this.outputPrinter = outputPrinter;
    }


    protected void processCommand(final Command command) {
        final CommandExecutor commandExecutor = commandExecutorFactory.getCommandExecutor(command);
        if (commandExecutor.validate(command)) {
            commandExecutor.execute(command);
        } else {
            throw new InvalidCommandException();
        }
    }

    public abstract void process() throws IOException;
}
