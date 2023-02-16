package com.deg540.fizzbuzz;

public class FizzRule implements Rule {

    @Override
    public boolean match(int number) {
        return number % 3 == 0;
    }

    @Override
    public String replace() {
        return "Fizz";
    }
}
