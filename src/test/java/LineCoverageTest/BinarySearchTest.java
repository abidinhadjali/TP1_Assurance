package LineCoverageTest;

import org.example.Anagram;
import org.example.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    void  isAnagramShouldRiseExceptionIfTheArrayInputIsNull() {

        Assertions.assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,5));

    }
    @Test
    void  isAnagramShouldReturnTheIndexOFTheMideleElementOfArrayIfTheInputElementEqualTheTheMideleElement() {
        int[] array= new int[4];
        for (int i = 0; i <=4; i++) {
            array[i]=i+1;

        }
        System.out.println((2+3)/2);

        Assertions.assertEquals(BinarySearch.binarySearch(array,5),'2');
    }

}
