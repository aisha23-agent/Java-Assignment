package OOP;

public class MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change the number as desired
        printMultiplicationTable(number);
    }
}
