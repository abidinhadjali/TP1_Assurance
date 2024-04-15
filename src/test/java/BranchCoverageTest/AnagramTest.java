package BranchCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    void  isAnagramShouldRiseExceptionIfTheTwoInputsAreNull() {
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,null));

    }
    @Test
    void  isAnagramShouldRiseExceptionIfTheFirstInputsIsNull() {
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,"hi"));

    }
    @Test
    void  isAnagramShouldRiseExceptionIfTheSecondInputsIsNull() {
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram("hi",null));

    }
    @Test
    void  isAnagramShouldReturnFalseIfLengthOfInputsAreDifferent() {

        Assertions.assertFalse( Anagram.isAnagram("AQl","Assurance"));
    }
    @Test
    void  isAnagramShouldReturnFalseIfInputsHaveDifferentCaractersAndHaveTheSameLength() {

        Assertions.assertFalse( Anagram.isAnagram("AQl","Amm"));
    }
    @Test
    void  isAnagramShouldReturnTrueIfInputsHaveSameCaractersAndHaveTheSameLength() {

        Assertions.assertTrue( Anagram.isAnagram("AQl","QAL"));
    }
}
