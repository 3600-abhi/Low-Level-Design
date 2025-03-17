package org.lld.tic_tac_toe_LLD.commands;

import org.lld.tic_tac_toe_LLD.models.Command;
import org.lld.tic_tac_toe_LLD.service.TicTacToeService;
import org.lld.tic_tac_toe_LLD.strategy.TicTacToeStrategy;

public abstract class CommandExecutor {
    protected final TicTacToeService ticTacToeService;
    protected final TicTacToeStrategy ticTacToeStrategy;

    public CommandExecutor(final TicTacToeService ticTacToeService, final TicTacToeStrategy ticTacToeStrategy) {
        this.ticTacToeService = ticTacToeService;
        this.ticTacToeStrategy = ticTacToeStrategy;
    }

    public abstract boolean validate(Command command);

    public abstract void execute(Command command);
}
