package com.deg540.fizzbuzz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FizzBuzz {

    private final Rule[] rules;

    public FizzBuzz(Rule... rules) {
        this.rules = rules;
    }

    public String convert(int number) {
        return Arrays.stream(rules).filter(rule -> rule.match(number)).findFirst().map(Rule::replace).orElse(String.valueOf(number));
    }

    public List<String> generate(int size) {

        return IntStream.rangeClosed(1, size).mapToObj(this::convert).collect(Collectors.toList());
    }
}
