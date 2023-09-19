package Loops;

public class SumOfMultiplicationTable {
    public static void main(String[] args) {
        int n = 8; // Change n to the desired number
        int sum = 0;

        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 10; i++) {
            int multiplicationResult = n * i;
            System.out.println(n + " x " + i + " = " + multiplicationResult);
            sum += multiplicationResult;
        }

        System.out.println("Sum of the numbers in the multiplication table: " + sum);
    }
}