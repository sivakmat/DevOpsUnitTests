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

}
