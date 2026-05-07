/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz { // This defines the code to be run? Or is it that if I press run it will know main

    public static void main(String[] args) { // Defines global static function that takes in no input but spits out a list of strings

        for (int i = 1; i < 100; i++) { // For loop that increments by 1 for i in 1 to 99, 99 numbers
            doFizzBuzz(i);
        }
    }

    private static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; // Boolean variable that stores whether 3 divides i
        boolean divisibleBy5 = i % 5 == 0; // "                                  " 5 divides i

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // && is the java equivalent of and in python

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
