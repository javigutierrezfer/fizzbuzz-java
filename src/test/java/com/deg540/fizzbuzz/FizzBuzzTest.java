package com.deg540.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "should return {1} when input is {0}")
    @CsvSource({"1,1", "3,3", "4,4"})
    void should_return_same_value_for_common_cases(int input, String expected) {
        assertEquals(expected, fizzBuzz.convert(input));
    }
}

