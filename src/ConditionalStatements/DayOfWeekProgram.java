package ConditionalStatements;

import java.util.Scanner;

public class DayOfWeekProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day of the Week Program");
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day";
        }

        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }
}
