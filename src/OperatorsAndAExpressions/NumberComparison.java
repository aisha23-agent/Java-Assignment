package OperatorsAndAExpressions;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a reference number: ");
        int refNumber = scanner.nextInt();

        System.out.print("Enter a number to compare: ");
        int userNumber = scanner.nextInt();

        if (userNumber > refNumber) {
            System.out.println("The entered number is greater than the reference number.");
        } else {
            System.out.println("The entered number is not greater than the reference number.");
        }
    }
}
