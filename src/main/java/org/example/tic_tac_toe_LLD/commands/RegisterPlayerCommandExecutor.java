package org.example.tic_tac_toe_LLD.commands;

import org.example.tic_tac_toe_LLD.exceptions.InvalidCommandException;
import org.example.tic_tac_toe_LLD.models.Command;
import org.example.tic_tac_toe_LLD.models.Player;
import org.example.tic_tac_toe_LLD.service.TicTacToeService;
import org.example.tic_tac_toe_LLD.strategy.TicTacToeStrategy;

/**
 * COMMAND: declare_player player_name symbol
 */
public class RegisterPlayerCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "declare_player";

    public RegisterPlayerCommandExecutor(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        super(ticTacToeService, ticTacToeStrategy);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 2;
    }

    @Override
    public void execute(Command command) {
        if (!validate(command)) {
            throw new InvalidCommandException();
        }

        final String userName = command.getParams().get(0);
        final Character symbol = command.getParams().get(1).charAt(0);
        Player player = new Player(userName, symbol);
        this.ticTacToeService.registerPlayer(player);
    }
}
