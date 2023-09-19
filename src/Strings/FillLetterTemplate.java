package Strings;

public class FillLetterTemplate {
    public static void main(String[] args) {
        String letterTemplate = "Dear [name],\n\nI am writing to inform you that you have been selected for the position of [position] at our company. We are impressed with your qualifications and believe that you will be a valuable addition to our team.\n\nPlease let us know your availability for the onboarding process.\n\nBest regards,\n[Your Name]";

        String name = "Aisha Tats";
        String position = "Software Engineer";
        String yourName = "Tatenda";

        String filledTemplate = letterTemplate.replace("[name]", name)
                .replace("[position]", position)
                .replace("[Your Name]", yourName);

        System.out.println(filledTemplate);
    }
}