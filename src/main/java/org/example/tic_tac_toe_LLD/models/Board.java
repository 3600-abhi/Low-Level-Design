package org.example.tic_tac_toe_LLD.models;

import org.example.tic_tac_toe_LLD.exceptions.NoSuchCellException;

public class Board {
    public static Integer size;
    public static char[][] matrix;

    public Board(int size) {
        Board.size = size;
        matrix = new char[size][size];
    }

    public static void updateMove(int r, int c, char symbol) {
        isValidCell(r - 1, c - 1);
        matrix[r - 1][c - 1] = symbol;
    }

    public static void isValidCell(int r, int c) {
        if (r < 0 || r >= size || c < 0 || c >= size) {
            throw new NoSuchCellException();
        }
    }
}
