package org.lld.tic_tac_toe_LLD.commands;

import org.lld.tic_tac_toe_LLD.exceptions.BoardNotInitializedException;
import org.lld.tic_tac_toe_LLD.exceptions.InvalidMoveException;
import org.lld.tic_tac_toe_LLD.models.Board;
import org.lld.tic_tac_toe_LLD.models.Command;
import org.lld.tic_tac_toe_LLD.models.Player;
import org.lld.tic_tac_toe_LLD.service.TicTacToeService;
import org.lld.tic_tac_toe_LLD.strategy.TicTacToeStrategy;
import org.lld.tic_tac_toe_LLD.validator.IntegerValidator;

/**
 * COMMAND: player_move username row col symbol
 */
public class PlayerMoveCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "player_move";

    public PlayerMoveCommandExecutor(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        super(ticTacToeService, ticTacToeStrategy);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 4 &&
                IntegerValidator.isInteger(command.getParams().get(1)) &&
                IntegerValidator.isInteger(command.getParams().get(2)) &&
                command.getParams().get(3).length() == 1;
    }

    @Override
    public void execute(Command command) {
        if (!validate(command)) {
            throw new InvalidMoveException();
        } else if (Board.size == null || Board.matrix == null) {
            throw new BoardNotInitializedException();
        }

        String username = command.getParams().get(0);
        char symbol = command.getParams().get(3).charAt(0);
        Player player = ticTacToeService.getPlayerWithUsernameAndSymbol(username, symbol);
        Player otherPlayer = ticTacToeService.getAnotherPlayer(player);

        int row = Integer.parseInt(command.getParams().get(1));
        int col = Integer.parseInt(command.getParams().get(2));

        if (player.getLastMovePlayed() == null && otherPlayer.getLastMovePlayed() == null) {
            Board.updateMove(row, col, symbol);
            player.setLastMovePlayed(true);
            otherPlayer.setLastMovePlayed(false);
        } else if (player.getLastMovePlayed()) {
            throw new InvalidMoveException();
        } else if (!player.getLastMovePlayed()) {
            Board.updateMove(row, col, symbol);
            player.setLastMovePlayed(true);
            otherPlayer.setLastMovePlayed(false);
            ticTacToeStrategy.checkWinner(player);
        }
    }
}
