package ConditionCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomunNumeralTest {
    @Test
    public void toRomanShouldRiseExceptionIfInputOutOfRange(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> RomanNumeral.toRoman(7000));
    }

    @Test
    public void toRomanShouldRiseExceptionIfInputIsNegative(){
        Assertions.assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(-1));
    }

    @Test
    public void toRomanShouldReturnTheRightTerm(){
        Assertions.assertEquals("X", RomanNumeral.toRoman(10));
    }
}
