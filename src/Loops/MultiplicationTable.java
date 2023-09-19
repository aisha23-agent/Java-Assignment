package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5; // Change n to the desired number

        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
