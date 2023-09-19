package Arrays;


            public class ArraySortCheck {
                public static void main(String[] args) {
                    int[] numbers = {1, 3, 5, 7, 6}; // Change the numbers as desired
                    boolean sorted = true;

                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] < numbers[i - 1]) {
                            sorted = false;
                            break;
                        }
                    }

                    if (sorted) {
                        System.out.println("The array is sorted.");
                    } else {
                        System.out.println("The array is not sorted.");
                    }
                }
            }