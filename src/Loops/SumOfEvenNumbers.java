package Loops;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int n = 10; // Change n to the desired number
        int sum = 0;
        int count = 1;
        int number = 2;

        while (count <= n) {
            sum += number;
            number += 2;
            count++;
        }

        System.out.println("Sum of the first " + n + " even numbers: " + sum);
    }
}