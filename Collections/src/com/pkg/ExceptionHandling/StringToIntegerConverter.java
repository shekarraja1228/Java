package com.pkg.ExceptionHandling;

//Create a package com.convert with a class that converts a
// String to an Integer using wrapper classes.
// Throw a custom exception if the string is not numeric.

import com.pkg.exceptions.NonNumericStringException;

public class StringToIntegerConverter {
    public static int convertor(String input) throws NonNumericStringException {
        if (input == null || !input.matches("-?\\d+")) {
            throw new NonNumericStringException("Input String is not a valid numeric value::" + input);
        }
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        String[] inputs = {"45", "A", "45.60", "-"};
        for (String input : inputs) {
            try {
                int result = convertor(input);
                System.out.println(result);
            }
            catch (NonNumericStringException ex) {
                System.out.println(ex.getMessage());
            }
            finally {
                System.out.println("finally");
            }
        }
    }
}
