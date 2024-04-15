package ConditionCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromTest {
    @Test
    void isPalindromeShouldReturnTrueIfElementIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("AQA"));
    }
    @Test
    void isPalindromeShouldRiseAnExceptionIfTheInputIsNUll(){
        Assertions.assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }
    @Test
    void isPalindromeShouldReturnFalseIfElementIsNotPalindrome(){

        Assertions.assertFalse(Palindrome.isPalindrome("akm"));
    }
}
