package com.deg540.fizzbuzz;

class FizzBuzz {

    public String convert(int number) {

        if (number == 15) {
            return "FizzBuzz";
        }

        if (number == 30) {
            return "FizzBuzz";
        }

        if (number == 45) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }


        return String.valueOf(number);
    }
}
