package OOP;

public class RecursiveSum {
    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change n to the desired number
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }
}