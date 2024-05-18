package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {
    private ScoreKeeper scoreKeeper;

    @BeforeEach
    public void setUp() {
        scoreKeeper = new ScoreKeeper();
    }

    @Test
    public void initialScoresShouldBeZero() {
        assertEquals(0, scoreKeeper.getScoreTeamA());
        assertEquals(0, scoreKeeper.getScoreTeamB());
    }

    @Test
    public void testScoreTeamA1() {
        scoreKeeper.scoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA2() {
        scoreKeeper.scoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamA3() {
        scoreKeeper.scoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB1() {
        scoreKeeper.scoreTeamB1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB2() {
        scoreKeeper.scoreTeamB2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamB3() {
        scoreKeeper.scoreTeamB3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    // Neuer Test für das Setzen von individuellen Punkteständen für Team A
    @Test
    public void testSetScoreTeamA() {
        scoreKeeper.setScoreTeamA(5);
        assertEquals("005:000", scoreKeeper.getScore());
    }

    // Neuer Test für das Erhöhen der Punktestände um einen bestimmten Wert für Team B
    @Test
    public void testAddScoreTeamB() {
        scoreKeeper.addScoreTeamB(4);
        assertEquals("000:004", scoreKeeper.getScore());
    }
    
    // Neuer Test für das Zurücksetzen der Punktestände bei Erreichen eines bestimmten Punktelimits
    @Test
    public void testCheckAndResetScores() {
        scoreKeeper.scoreTeamA3();
        scoreKeeper.addScoreTeamB(100);
        scoreKeeper.checkAndResetScores();
        assertEquals("000:000", scoreKeeper.getScore());
    }
}
