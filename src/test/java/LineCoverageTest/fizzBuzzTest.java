package LineCoverageTest;

import org.example.FizzBuzz;
import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fizzBuzzTest {
    @Test
    void  fizzBuzzShouldRiseExceptionIfTheInputIsLowerThenOne() {

        Assertions.assertThrows(IllegalArgumentException.class,()-> FizzBuzz.fizzBuzz(-5));

    }
    @Test
    void solveShouldReturnOrg_example_FizzBuzzIfInputIsDivisibleOf15(){
        Assertions.assertEquals("org.example.FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
    @Test
    void solveShouldReturnFizzBuzzIfInputIsDivisibleOf3AndNotDivisibleOf15(){
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }
    @Test
    void solveShouldReturnFizzBuzzIfInputIsDivisibleOf5AndNotDivisibleOf15And3(){
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
    @Test
    void solveShouldReturnFizzBuzzIfInputIsNotDivisibleOf5And15And3(){
        Assertions.assertEquals("13", FizzBuzz.fizzBuzz(13));
    }
}
