package Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Change the numbers as desired

        System.out.println("Original array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nReversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
