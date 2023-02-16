package com.deg540.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void convert_1_to_1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void convert_2_to_2() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void convert_4_to_4() {
        assertEquals("4", fizzBuzz.convert(4));
    }
}

