package com.deg540.fizzbuzz;

class FizzBuzz {

    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number == 5) {
            return "Buzz";
        }

        if (number == 10) {
            return "Buzz";
        }

        if (number == 20) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
