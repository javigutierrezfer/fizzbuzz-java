package com.deg540.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FizzBuzz {

    public String convert(int number) {

        String result = "";

        if (number % 3 == 0) {
            result = "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }


        return result.isEmpty() ? String.valueOf(number) : result;
    }

    public List<String> generate(int size) {
        List<String> numbers = IntStream.rangeClosed(1, size).mapToObj(this::convert).collect(Collectors.toList());

        return numbers;
    }
}
