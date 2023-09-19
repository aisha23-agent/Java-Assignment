package Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 11, 5, 1}; // Change the numbers as desired
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
