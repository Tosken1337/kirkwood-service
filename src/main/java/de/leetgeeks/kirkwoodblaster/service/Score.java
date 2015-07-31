package de.leetgeeks.kirkwoodblaster.service;

public class Score {

    private final long id;
    private final String playerNick;
    private final int score;

    public Score(long id, String playerNick, int score) {
        this.id = id;
        this.playerNick = playerNick;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public String getPlayerNick() {
        return playerNick;
    }

    public int getScore() {
        return score;
    }
}
