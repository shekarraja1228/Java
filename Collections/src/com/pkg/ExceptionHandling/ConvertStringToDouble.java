package com.pkg.ExceptionHandling;

import com.pkg.exceptions.InvalidSalaryException;

public class ConvertStringToDouble {

    public static void validateSalary(String salary) throws InvalidSalaryException {
        try {
            double sal = Double.parseDouble(salary);
            if (sal < 0) {
                throw new InvalidSalaryException("salary cannot be -ve");
            }
            System.out.println("processed salary: $" + sal);
        } catch (NumberFormatException nfe) {
            throw new InvalidSalaryException("Invalid salary format: " + salary);
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"5000", "-5000", "abc"};

        for (String input : inputs) {
            try {
                validateSalary(input);
            } catch (InvalidSalaryException ise) {
                System.out.println(ise.getMessage());
            }
        }
    }

}
