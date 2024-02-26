package LineCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
    @Test
    void isPalindromeShouldReturnTrueIfElementIspalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("kaaak"));
    }
    @Test
    void isPalindromeShouldRiseAnExceptionIfTheInputIsNUll(){
        Assertions.assertThrows(NullPointerException.class,()-> Palindrome.isPalindrome(null));
    }
    @Test
    void isPalindromeShouldReturnFalseIfElementIspalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("ak"));
    }
//    @Test
//    void isPalindromeShouldReturnTrueIfJ<i(){
//        Assertions.assertFalse(Palindrome.isPalindrome("ak"));
//    }


}