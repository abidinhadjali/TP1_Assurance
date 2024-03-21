package LineCoverageTest;

import org.example.BinarySearch;
import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    @Test
    void  isAnagramShouldRiseExceptionIfTheArrayInputIsNull() {

        Assertions.assertThrows(IllegalArgumentException.class,()-> QuadraticEquation.solve(0,1,5));

    }
}
