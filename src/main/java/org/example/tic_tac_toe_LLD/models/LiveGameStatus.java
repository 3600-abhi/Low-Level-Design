package org.example.tic_tac_toe_LLD.models;

public class LiveGameStatus {
    private static LiveGameStatus INSTANCE;
    private Boolean isGameEnded;

    private LiveGameStatus() {
    }

    public static LiveGameStatus getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LiveGameStatus();
        }

        return INSTANCE;
    }

    public void setIsGameEnded(Boolean isGameEnded) {
        this.isGameEnded = isGameEnded;
    }

    public Boolean getIsGameEnded() {
        return isGameEnded;
    }
}
