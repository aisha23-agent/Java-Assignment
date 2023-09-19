package VariablesAndDatatypes;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMarks = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextDouble();
        }

        double averagePercentage = (totalMarks / 500) * 100; // Assuming each subject is out of 100
        System.out.println("The average percentage score is: " + averagePercentage + "%");
    }
}