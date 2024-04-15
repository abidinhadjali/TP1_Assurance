package LineCoverageTest;


import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    @Test
    public void toRomanShouldRiseExceptionIfInputOutOfRange(){
        Assertions.assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(4000));
    }

    @Test
    public void toRomanShouldReturnTheRightTerm(){
        Assertions.assertEquals("X", RomanNumeral.toRoman(10));
    }

}
