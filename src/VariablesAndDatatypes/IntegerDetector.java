package VariablesAndDatatypes;

import java.util.Scanner;

public class IntegerDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            System.out.println("The entered number is an integer.");
        } else {
            System.out.println("The entered number is not an integer.");
        }
    }
}