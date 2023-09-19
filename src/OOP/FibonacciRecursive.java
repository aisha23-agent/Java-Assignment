package OOP;

public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6; // Change n to the desired number
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci series is: " + result);
    }
}
