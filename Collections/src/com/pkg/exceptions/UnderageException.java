package com.pkg.exceptions;

public class UnderageException extends Exception {
    public UnderageException(int age) {
        super("Access denied. Age " + age + " is below the legal threshold of 18.");    }
}
