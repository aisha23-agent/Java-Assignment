package VariablesAndDatatypes;

import java.util.Scanner;

public class KilometerToMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " km is equivalent to " + miles + " miles.");
    }
}