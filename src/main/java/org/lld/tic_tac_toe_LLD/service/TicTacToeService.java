package org.lld.tic_tac_toe_LLD.service;

import org.lld.tic_tac_toe_LLD.OutputPrinter;
import org.lld.tic_tac_toe_LLD.exceptions.NoSuchPlayerException;
import org.lld.tic_tac_toe_LLD.exceptions.PlayerAlreadyRegisteredException;
import org.lld.tic_tac_toe_LLD.exceptions.PlayerNotRegisteredException;
import org.lld.tic_tac_toe_LLD.models.Player;

public class TicTacToeService {
    private static Player player1;
    private static Player player2;

    public void registerPlayer(final Player player) {
        if (player1 == null) {
            player1 = player;
            OutputPrinter.player1DeclaredMsg();
        } else if (player2 == null) {
            player2 = player;
            OutputPrinter.player2DeclaredMsg();
        } else {
            throw new PlayerAlreadyRegisteredException();
        }
    }

    public Player getPlayerWithUsernameAndSymbol(String username, char symbol) {
        if (player1.getUsername().equals(username) && player1.getSymbol() == symbol) {
            return player1;
        } else if (player2.getUsername().equals(username) && player2.getSymbol().equals(symbol)) {
            return player2;
        } else {
            throw new NoSuchPlayerException();
        }
    }

    public Player getAnotherPlayer(Player player) {
        if (player1 == null || player2 == null) {
            throw new PlayerNotRegisteredException();
        } else if (player1.getUsername().equals(player.getUsername())) {
            return player2;
        } else if (player2.getUsername().equals(player.getUsername())) {
            return player1;
        }

        return null;
    }
}
