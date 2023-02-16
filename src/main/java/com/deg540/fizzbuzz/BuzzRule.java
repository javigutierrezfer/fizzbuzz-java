package com.deg540.fizzbuzz;

public class BuzzRule implements Rule {

    @Override
    public boolean match(int number) {
        return number % 5 == 0;
    }

    @Override
    public String replace() {
        return "Buzz";
    }
}