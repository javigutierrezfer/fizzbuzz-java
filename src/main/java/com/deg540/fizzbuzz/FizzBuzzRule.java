package com.deg540.fizzbuzz;

public class FizzBuzzRule implements Rule {

    @Override
    public boolean match(int number) {
        return number % 15 == 0;
    }

    @Override
    public String replace() {
        return "FizzBuzz";
    }
}