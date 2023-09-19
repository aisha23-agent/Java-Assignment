package Loops;

public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Reverse multiplication table of 10:");

        for (int i = 10; i >= 1; i--) {
            System.out.println("10 x " + i + " = " + (10 * i));
        }
    }
}
