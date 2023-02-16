package com.deg540.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "should return {1} when input is {0}")
    @CsvSource({"1,1", "2,2", "4,4"})
    void should_return_same_value_for_common_cases(int input, String expected) {
        assertEquals(expected, fizzBuzz.convert(input));
    }

    @ParameterizedTest(name = "should return {1} when input is {0}")
    @CsvSource({"3,Fizz", "6,Fizz", "9,Fizz"})
    void should_return_Fizz_when_value_is_multiple_of_3(int input, String expected) {
        assertEquals(expected, fizzBuzz.convert(input));
    }

    @Test
    void should_return_Buzz_when_value_is_5() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void should_return_Buzz_when_value_is_10() {
        assertEquals("Buzz", fizzBuzz.convert(10));
    }

    @Test
    void should_return_Buzz_when_value_is_20() {
        assertEquals("Buzz", fizzBuzz.convert(20));
    }
}

