package org.example.tic_tac_toe_LLD;

public class OutputPrinter {
    private static final String WELCOME_MSG = "Welcome to Tic-Tac-Toe !!";
    private static final String EXIT_MSG = "Please wait, terminating game...";
    private static final String PLAYER_1_DECLARED_MSG = "Player-1 declared successfully";
    private static final String PLAYER_2_DECLARED_MSG = "Player-2 declared successfully";
    private static final String GAME_ENDED_MESSAGE = "Game Ended ...";
    private static final String PLAYER_WON_MSG = " win the game !!";

    public static void printWithNewLine(String msg) {
        System.out.println(msg);
    }

    public static void welcome() {
        printWithNewLine(WELCOME_MSG);
    }

    public static void exit() {
        printWithNewLine(EXIT_MSG);
    }

    public static void player1DeclaredMsg() {
        printWithNewLine(PLAYER_1_DECLARED_MSG);
    }

    public static void player2DeclaredMsg() {
        printWithNewLine(PLAYER_2_DECLARED_MSG);
    }

    public static void gameEndedMsg() {
        printWithNewLine(GAME_ENDED_MESSAGE);
    }

    public static void playerWinMsg(final String msg) {
        printWithNewLine(msg + PLAYER_WON_MSG);
    }
}
