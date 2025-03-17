package org.lld.tic_tac_toe_LLD.models;


import org.lld.tic_tac_toe_LLD.exceptions.InvalidCommandException;

import java.util.Arrays;
import java.util.List;

public class Command {
    private static final String SPACE = " ";
    private final String commandName;
    private final List<String> params;

    public Command(final String input) {
        final List<String> commandInfo = Arrays.stream(input.trim().split(SPACE))
                                               .map(String::trim)
                                               .toList();

        if (commandInfo.isEmpty()) {
            throw new InvalidCommandException();
        }

        commandName = commandInfo.get(0);
        params = commandInfo.stream().skip(1).toList();
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams() {
        return params;
    }

}
