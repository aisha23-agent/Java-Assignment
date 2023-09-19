package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        float[] numbers = {1.5f, 2.3f, 3.7f, 4.1f, 5.8f}; // Change the numbers as desired
        float sum = 0;

        for (float number : numbers) {
            sum += number;
        }

        System.out.println("Sum of the numbers in the array: " + sum);
    }
}
