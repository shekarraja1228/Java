package com.pkg.ExceptionHandling;

import com.pkg.exceptions.NotADigitException;

public class ValidateCharacter {

    // Method to check if a character is a digit
    public static void validateDigit(char ch) throws NotADigitException {
        if (!Character.isDigit(ch)) {
            throw new NotADigitException(ch);
        }
        System.out.println("Character '" + ch + "' is a valid digit.");
    }

    public static void main(String[] args) {
        char[] ch = {'C', '5'};
        for(char cha : ch){
            try {
                validateDigit(cha);
            } catch (NotADigitException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
