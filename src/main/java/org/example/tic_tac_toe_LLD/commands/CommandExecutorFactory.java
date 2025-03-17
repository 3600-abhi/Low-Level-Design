package org.example.tic_tac_toe_LLD.commands;

import org.example.tic_tac_toe_LLD.exceptions.InvalidCommandException;
import org.example.tic_tac_toe_LLD.models.Command;
import org.example.tic_tac_toe_LLD.service.TicTacToeService;
import org.example.tic_tac_toe_LLD.strategy.TicTacToeStrategy;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {
    private final Map<String, CommandExecutor> commands = new HashMap<>();

    public CommandExecutorFactory(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        commands.put(RegisterPlayerCommandExecutor.COMMAND_NAME, new RegisterPlayerCommandExecutor(ticTacToeService, ticTacToeStrategy));
        commands.put(InitializeBoardCommandExecutor.COMMAND_NAME, new InitializeBoardCommandExecutor(ticTacToeService, ticTacToeStrategy));
        commands.put(PlayerMoveCommandExecutor.COMMAND_NAME, new PlayerMoveCommandExecutor(ticTacToeService, ticTacToeStrategy));
        commands.put(ExitCommandExecutor.COMMAND_NAME, new ExitCommandExecutor(ticTacToeService, ticTacToeStrategy));
    }

    public CommandExecutor getCommandExecutor(final Command command) {
        final CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if (commandExecutor == null) {
            throw new InvalidCommandException();
        }
        return commandExecutor;
    }
}
