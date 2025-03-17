package org.example.tic_tac_toe_LLD.models;

public class Player {
    private final String username;
    private final Character symbol;
    private Boolean lastMovePlayed;


    public Player(String username, char symbol) {
        this.username = username;
        this.symbol = symbol;
        this.lastMovePlayed = null;
    }

    public String getUsername() {
        return username;
    }

    public Character getSymbol() {
        return symbol;
    }

    public Boolean getLastMovePlayed() {
        return lastMovePlayed;
    }

    public void setLastMovePlayed(Boolean lastMovePlayed) {
        this.lastMovePlayed = lastMovePlayed;
    }
}
