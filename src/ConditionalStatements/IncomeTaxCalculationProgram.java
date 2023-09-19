package ConditionalStatements;

import java.util.Scanner;

public class IncomeTaxCalculationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Income Tax Calculation Program");
        System.out.print("Enter income: ");
        double income = scanner.nextDouble();

        double tax;
        if (income >= 2.5 && income < 5.0) {
            tax = income * 0.05;
        } else if (income >= 5.0 && income < 10.0) {
            tax = income * 0.2;
        } else if (income >= 10.0) {
            tax = income * 0.3;
        } else {
            tax = 0.0;
        }

        System.out.println("Income tax to be paid: " + tax);

        scanner.close();
    }
}
