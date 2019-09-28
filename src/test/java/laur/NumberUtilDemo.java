package laur;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberUtilDemo {

    @Test
    public void givenPositiveValue_whenCheckIfPositive_thenReturnTrue() {
        NumberUtil numberUtil = new NumberUtil();
//        numberUtil.setValue(20);
//        boolean expectedResult = true;

        boolean actualResult = numberUtil.checkIfPositive(-5);

//        assertEquals(expectedResult, actualResult);
        assertThat(actualResult).isFalse();
    }
}