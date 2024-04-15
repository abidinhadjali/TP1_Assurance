package ConditionCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarysearhTest {
    @Test
    void  binarySearchShouldRiseExceptionIfTheArrayInputIsNull() {

        Assertions.assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,5));

    }
    @Test
    void  binarySearchShouldReturnTheRightIndexIfInputElementExistInArray() {
        int[] array= new int[5];

        array[0]=1;
        array[1]=2;
        array[2]=7;
        array[3]=10;
        array[4]=15;


        Assertions.assertEquals(2,BinarySearch.binarySearch(array,7));
    }
    @Test
    void  binarySearchShouldReturnMinusOneTheElementDoesNotExist() {
        int[] array= new int[4];

        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        Assertions.assertEquals(-1,BinarySearch.binarySearch(array,8));


    }
}
