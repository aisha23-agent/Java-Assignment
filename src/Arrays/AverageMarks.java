package Arrays;

public class AverageMarks {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 95}; // Change the marks as desired
        int sum = 0;
        int count = 0;

        for (int mark : marks) {
            sum += mark;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Average marks in Physics: " + average);
    }
}
