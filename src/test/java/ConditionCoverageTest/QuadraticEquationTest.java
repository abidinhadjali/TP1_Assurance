package ConditionCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    @Test
    void  solveShouldRiseExceptionIfTheFirstInputEqualZero() {

        Assertions.assertThrows(IllegalArgumentException.class,()-> QuadraticEquation.solve(0,1,5));

    }
    @Test
    void solveShouldReturnNullIfDeltaIsLowerThenZero(){
        Assertions.assertEquals(null, QuadraticEquation.solve(1,0,5));
    }
    @Test
    void  solveShouldReturnTheRightResultIfDeltaEqualZero() {
        Assertions.assertArrayEquals(new double[]{1}, QuadraticEquation.solve(1,-2,1));

    }
    @Test
    void  solveShouldReturnTheRightResultIfDeltaIsBigerThenZero() {
        Assertions.assertArrayEquals(new double[]{1,-1}, QuadraticEquation.solve(1,0,-1));

    }
}
