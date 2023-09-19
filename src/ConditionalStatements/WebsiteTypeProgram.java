package ConditionalStatements;

import java.util.Scanner;

public class WebsiteTypeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Website Type Program");
        System.out.print("Enter a website URL: ");
        String url = scanner.next();

        String websiteType;
        if (url.endsWith(".com")) {
            websiteType = "Commercial website";
        } else if (url.endsWith(".org")) {
            websiteType = "Organization website";
        } else if (url.endsWith(".in")) {
            websiteType = "Indian website";
        } else {
            websiteType = "Unknown website type";
        }

        System.out.println("Website type: " + websiteType);

        scanner.close();
    }
}
