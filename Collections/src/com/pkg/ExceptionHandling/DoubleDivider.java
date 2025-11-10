package com.pkg.ExceptionHandling;


/*
In package com.math, write a class that accepts two Double values (as strings),
converts them using Double.valueOf(), and performs division.
Handle divide-by-zero and format exceptions.
*/

public class DoubleDivider {

    // Method to divide two string inputs as doubles
    public static double divide(String numeratorStr, String denominatorStr) {
        try {
            Double numerator = Double.valueOf(numeratorStr);
            Double denominator = Double.valueOf(denominatorStr);

            if (denominator == 0.0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            return numerator / denominator;

        } catch (NumberFormatException e) {
            System.err.println("Invalid input format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        }

        return Double.NaN; // Return NaN if an error occurred
    }

    // Main method for testing
    public static void main(String[] args) {
        String[][] testCases = {
                {"100.5", "2.0"},
                {"abc", "3.0"},
                {"45.0", "0.0"},
                {"12.3", "xyz"}
        };

        for (String[] test : testCases) {
            double result = divide(test[0], test[1]);
            System.out.println("Result of dividing " + test[0] + " by " + test[1] + " = " + result);
        }
    }
}
