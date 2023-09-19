package Loops;

public class Factorial {
    public static void main(String[] args) {
        int n = 6; // Change n to the desired number
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + ": " + factorial);
    }
}
