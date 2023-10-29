package racingcar.generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static racingcar.enums.RacingConfig.RANDOM_NUMBER_MAX;
import static racingcar.enums.RacingConfig.RANDOM_NUMBER_MIN;

class RandomNumberGeneratorTest {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void 생성된_랜덤_숫자는_범위_내의_숫자_중_하나이다() {
        // when
        int randomNumber = randomNumberGenerator.generateNumber();

        // then
        assertTrue(randomNumber >= RANDOM_NUMBER_MIN.getValue());
        assertTrue(randomNumber <= RANDOM_NUMBER_MAX.getValue());
    }
}