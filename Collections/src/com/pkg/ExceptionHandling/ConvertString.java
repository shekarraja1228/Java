package com.pkg.ExceptionHandling;

import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Read and convert the boolean
        System.out.println("Enter the boolean value.");
        String input1 = sc.nextLine();

        try {
            boolean value1 = Boolean.parseBoolean(input1);
            System.out.println("Converted to Boolean:" + value1);
        } catch (Exception e) {
            System.out.println("Invalid input:" + e);
        }

        //Read and convert the Integer
        System.out.println("Enter the integer value.");
        String input2 = sc.nextLine();

        try {
            int value2 = Integer.parseInt(input2);
            System.out.println("Converted to Integer:" + value2);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input:" + nfe);
        }

        //Read and convert the Double
        System.out.println("Enter the double value");
        String input3 = sc.nextLine();

        try {
            double value3 = Double.parseDouble(input3);
            System.out.println("Converted to Double:" + value3);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input:" + nfe);
        }

        sc.close();
    }
}
