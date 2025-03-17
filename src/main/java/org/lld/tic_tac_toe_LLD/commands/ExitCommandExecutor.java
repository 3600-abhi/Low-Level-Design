package org.lld.tic_tac_toe_LLD.commands;

import org.lld.tic_tac_toe_LLD.OutputPrinter;
import org.lld.tic_tac_toe_LLD.exceptions.InvalidCommandException;
import org.lld.tic_tac_toe_LLD.models.Command;
import org.lld.tic_tac_toe_LLD.service.TicTacToeService;
import org.lld.tic_tac_toe_LLD.strategy.TicTacToeStrategy;

public class ExitCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "exit";

    public ExitCommandExecutor(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        super(ticTacToeService, ticTacToeStrategy);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().isEmpty();
    }

    @Override
    public void execute(Command command) {
        if (validate(command)) {
            throw new InvalidCommandException();
        }

        OutputPrinter.exit();
    }
}
