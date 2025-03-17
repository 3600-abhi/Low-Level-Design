package org.lld.tic_tac_toe_LLD;

import org.lld.tic_tac_toe_LLD.commands.CommandExecutor;
import org.lld.tic_tac_toe_LLD.commands.CommandExecutorFactory;
import org.lld.tic_tac_toe_LLD.commands.ExitCommandExecutor;
import org.lld.tic_tac_toe_LLD.models.Command;
import org.lld.tic_tac_toe_LLD.models.LiveGameStatus;
import org.lld.tic_tac_toe_LLD.service.TicTacToeService;
import org.lld.tic_tac_toe_LLD.strategy.SimpleTicTacToeStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeExample {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        OutputPrinter.welcome();

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            final String input;

            try {
                input = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            final Command command = new Command(input);

            if (ExitCommandExecutor.COMMAND_NAME.equalsIgnoreCase(command.getCommandName())) {
                OutputPrinter.exit();
                break;
            } else {
                processCommand(command);

                if (LiveGameStatus.getInstance().getIsGameEnded() != null && LiveGameStatus.getInstance().getIsGameEnded()) {
                    OutputPrinter.exit();
                    break;
                }
            }
        }
    }

    public static void processCommand(final Command command) {
        final CommandExecutor commandExecutor = new CommandExecutorFactory(new TicTacToeService(), new SimpleTicTacToeStrategy())
                .getCommandExecutor(command);
        commandExecutor.execute(command);
    }
}
