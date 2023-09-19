package OperatorsAndAExpressions;

import java.util.Scanner;

public class PhysicsFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for v: ");
        double v = scanner.nextDouble();

        System.out.print("Enter value for u: ");
        double u = scanner.nextDouble();

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for s: ");
        double s = scanner.nextDouble();

        double result = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        System.out.println("The result is: " + result);
    }
}

