# FizzBuzzJUnit
A simple FizzBuzz Java program using jUnit

This is a simple FizzBuzz Java program with jUnit basic tests.
A FizzBuzz program should print, for a range of numbers, the number itself, accompanied by "fizz" if the number is divisible by 3, "buzz" if the number is divisible by 5, or "fizzBuzz" if the number is divisible by 3 and 5.

For instance: 
- for the number 3, it should print "3 fizz";
- for the number 9, "9 fizz";
- for the number 10, "10 buzz";
- for the number 15, "15 fizzBuzz";

The FizzBuzz class receives an initial and a final number, and does the printing for all numbers in this range.
A new exception "BiggerInitialValueException" is thrown when the initial number is bigger than the final.
jUnit Framework can test exceptions with annotation @Test(expected=BiggerInitialValueException.class).

