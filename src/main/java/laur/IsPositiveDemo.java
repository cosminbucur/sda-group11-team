package laur;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsPositiveDemo {


    @Test

    public void givenWhenValueIsGreaterThanZero_ThenReturnTrue() {

        IsPositive isPositive = new IsPositive();
        isPositive.setValue(20);
        boolean expectedResult = true;


        boolean actualResult = isPositive.checkIfPositive();

        assertEquals(expectedResult, actualResult);

    }
}