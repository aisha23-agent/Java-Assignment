package Strings;

public class ReplaceSpacesWithUnderscores {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        String replacedStr = str.replace(" ", "_");
        System.out.println("Original String: " + str);
        System.out.println("Replaced String: " + replacedStr);
    }
}