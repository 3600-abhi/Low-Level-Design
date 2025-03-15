package org.example.parkingLot_LLD.mode;

import org.example.parkingLot_LLD.OutputPrinter;
import org.example.parkingLot_LLD.commands.CommandExecutorFactory;
import org.example.parkingLot_LLD.model.Command;

import java.io.*;

public class FileMode extends Mode {
    private String fileName;

    public FileMode(final CommandExecutorFactory commandExecutorFactory, final OutputPrinter outputPrinter, final String fileName) {
        super(commandExecutorFactory, outputPrinter);
        this.fileName = fileName;
    }


    @Override
    public void process() throws IOException {
        final File file = new File(fileName);
        final BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            outputPrinter.invalidFile();
            return;
        }

        String input = reader.readLine();
        while (input != null) {
            final Command command = new Command(input);
            processCommand(command);
            input = reader.readLine();
        }
    }
}