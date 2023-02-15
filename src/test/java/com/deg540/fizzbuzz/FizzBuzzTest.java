package com.deg540.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    @Test
    public void convert_1_to_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }
}

