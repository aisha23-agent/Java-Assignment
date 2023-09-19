package Loops;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        int n = 6; // Change n to the desired number
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + ": " + factorial);
    }
}
