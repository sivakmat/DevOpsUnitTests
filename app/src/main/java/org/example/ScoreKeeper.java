package org.example;

public class ScoreKeeper {
    private int scoreTeamA;
    private int scoreTeamB;

    public ScoreKeeper() {
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    // Neue Methoden zum Abrufen der Punktestände
    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }
    
}

