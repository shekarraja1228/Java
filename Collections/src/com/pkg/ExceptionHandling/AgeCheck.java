package com.pkg.ExceptionHandling;

import com.pkg.exceptions.UnderageException;

public class AgeCheck {
    public static void validateAge(String age) throws UnderageException {
        try{
            int convertedAge = Integer.parseInt(age);
            if(convertedAge < 18) {
                throw new UnderageException(convertedAge);
            }
            System.out.println("Access granted. Age " + age + " is valid.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input: '" + age + "' is not a valid number.");        }
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] testAges = { "20", "17", "abc", "18" };

        for (String age : testAges) {
            try {
                validateAge(age);
            } catch (UnderageException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
