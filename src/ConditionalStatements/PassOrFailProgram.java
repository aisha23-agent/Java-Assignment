package ConditionalStatements;

import java.util.Scanner;

public class PassOrFailProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pass or Fail Program");
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();

        double totalPercentage = (subject1 + subject2 + subject3) / 3.0;

        if (totalPercentage >= 40 && subject1 >= 33 && subject2 >= 33 && subject3 >= 33) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry! You have failed.");
        }

        scanner.close();
    }
}
