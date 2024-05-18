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

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }

    // Neue Methoden zum Punkte an den jeweiligen Teams zu vergeben
    public void scoreTeamA1() {
        scoreTeamA += 1;
    }

    public void scoreTeamA2() {
        scoreTeamA += 2;
    }

    public void scoreTeamA3() {
        scoreTeamA += 3;
    }

    public void scoreTeamB1() {
        scoreTeamB += 1;
    }

    public void scoreTeamB2() {
        scoreTeamB += 2;
    }

    public void scoreTeamB3() {
        scoreTeamB += 3;
    }

    // Neue Methode zum Setzen des Punktestands für Team A
    public void setScoreTeamA(int score) {
        scoreTeamA = score;
    }

    // Neue Methode zum Erhöhen des Punktestands für Team B um einen bestimmten Wert
    public void addScoreTeamB(int points) {
        scoreTeamB += points;
    }
}

