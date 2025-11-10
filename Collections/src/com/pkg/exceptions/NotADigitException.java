package com.pkg.exceptions;

public class NotADigitException extends Exception{
    public NotADigitException(char ch) {
        super("Character '" + ch + "' is not a digit.");
    }
}
