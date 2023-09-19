package OperatorsAndAExpressions;

public class GradeEncryption {
    public static void main(String[] args) {
        char grade = 'B'; // example grade
        char encryptedGrade = (char) (grade + 8);
        char decryptedGrade = (char) (encryptedGrade - 8);

        System.out.println("Original Grade: " + grade);
        System.out.println("Encrypted Grade: " + encryptedGrade);
        System.out.println("Decrypted Grade: " + decryptedGrade);
    }
}

