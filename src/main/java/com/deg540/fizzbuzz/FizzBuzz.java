package com.deg540.fizzbuzz;

class FizzBuzz {

    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
