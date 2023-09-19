package Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10}; // Change the numbers as desired
        int target = 6; // Change the target number as desired
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}
