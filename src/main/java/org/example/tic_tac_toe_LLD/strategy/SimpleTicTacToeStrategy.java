package org.example.tic_tac_toe_LLD.strategy;

import org.example.tic_tac_toe_LLD.OutputPrinter;
import org.example.tic_tac_toe_LLD.models.Board;
import org.example.tic_tac_toe_LLD.models.LiveGameStatus;
import org.example.tic_tac_toe_LLD.models.Player;

public class SimpleTicTacToeStrategy implements TicTacToeStrategy {

    @Override
    public void checkWinner(Player player) {
        char[][] matrix = Board.matrix;
        char symbol = player.getSymbol();

        if (checkMainDiagonal(matrix, symbol) || checkCrossDiagonal(matrix, symbol) || checkAllRow(matrix, symbol) || checkAllColumn(matrix, symbol)) {
            OutputPrinter.playerWinMsg(player.getUsername());
            LiveGameStatus.getInstance().setIsGameEnded(true);
        }
    }

    private boolean checkMainDiagonal(char[][] matrix, char symbol) {
        int i = 0, j = 0;

        while (i < matrix.length && j < matrix[0].length) {
            if (matrix[i][j] != symbol) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }

    private boolean checkCrossDiagonal(char[][] matrix, char symbol) {
        int i = 0, j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] != symbol) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean checkAllRow(char[][] matrix, char symbol) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isWinner = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != symbol) {
                    isWinner = false;
                    break;
                }
            }

            if (isWinner) {
                return true;
            }
        }

        return false;
    }

    private boolean checkAllColumn(char[][] matrix, char symbol) {
        for (int j = 0; j < matrix[0].length; j++) {
            boolean isWinner = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] != symbol) {
                    isWinner = false;
                    break;
                }
            }

            if (isWinner) {
                return true;
            }
        }

        return false;
    }
}
