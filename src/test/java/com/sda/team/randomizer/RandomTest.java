package com.sda.team.randomizer;

import com.sda.team.randomizer2.RandomizerOldApp;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RandomTest {

    @Test
    public void givenMinAndMax_whenGetRandomDifficulty_thenReturnRandomNumber() {
        int min = 1;
        int max = 5;

        int actualResult = RandomizerOldApp.getRandomDifficulty(min, max);

        assertThat(actualResult).isGreaterThan(min);
        assertThat(actualResult).isLessThan(max);
    }
}
