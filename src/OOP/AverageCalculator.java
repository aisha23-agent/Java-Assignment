package OOP;

public class AverageCalculator {
    public static double calculateAverage(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double average = calculateAverage(5.5, 6.8, 7.2, 9.6, 3.4); // Change the numbers as desired
        System.out.println("Average: " + average);
    }
}
