package LineCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
    @Test
    void isPalindromeShouldReturnTrueIfElementIsPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("AQLQA"));
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