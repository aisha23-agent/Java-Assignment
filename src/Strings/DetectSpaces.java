package Strings;

public class DetectSpaces {
    public static void main(String[] args) {
        String str = "This  is a string  with double  and   triple spaces";
        boolean hasDoubleSpaces = str.contains("  ");
        boolean hasTripleSpaces = str.contains("   ");

        System.out.println("String: " + str);
        System.out.println("Has double spaces: " + hasDoubleSpaces);
        System.out.println("Has triple spaces: " + hasTripleSpaces);
    }
}
