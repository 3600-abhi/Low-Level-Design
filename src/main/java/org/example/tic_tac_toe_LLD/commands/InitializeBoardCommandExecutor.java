package org.example.tic_tac_toe_LLD.commands;

import org.example.parkingLot_LLD.validator.IntegerValidator;
import org.example.tic_tac_toe_LLD.exceptions.InvalidBoardDimensionException;
import org.example.tic_tac_toe_LLD.models.Board;
import org.example.tic_tac_toe_LLD.models.Command;
import org.example.tic_tac_toe_LLD.service.TicTacToeService;
import org.example.tic_tac_toe_LLD.strategy.TicTacToeStrategy;

/**
 * COMMAND: initialize_board dimension
 */
public class InitializeBoardCommandExecutor extends CommandExecutor {
    public static final String COMMAND_NAME = "initialize_board";

    public InitializeBoardCommandExecutor(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        super(ticTacToeService, ticTacToeStrategy);
    }

    @Override
    public boolean validate(Command command) {
        return command.getParams().size() == 1 && IntegerValidator.isInteger(command.getParams().get(0)) && Integer.parseInt(command.getParams().get(0)) % 2 == 1;
    }

    @Override
    public void execute(Command command) {
        if (!validate(command)) {
            throw new InvalidBoardDimensionException();
        }

        int size = Integer.parseInt(command.getParams().get(0));
        Board.size = size;
        Board.matrix = new char[size][size];
    }
}
