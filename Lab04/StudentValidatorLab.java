package COMP1008W2026.Lab04;

import java.util.*;
import java.util.regex.*;

// Thiemi Soubhia Doi - 200645138

public class StudentValidatorLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================

        // STEP 1:
        // Ask user to enter full name
        System.out.println("Please inform your full name: ");
        String fullName = scanner.nextLine();

        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()

        if (fullName.matches("[a-zA-Z ]+")) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
            System.out.println("Name must contain only letters and spaces");
        }

        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================

        // STEP 3:
        // Ask user to enter student ID
        System.out.println("Please inform your student ID: ");
        String studentID = scanner.nextLine();

        // STEP 4:
        // Validate format using regex
        if (studentID.matches("S-\\d{4}")) {
            System.out.println("Valid student ID");
        } else {
            System.out.println("Invalid student ID");
            System.out.println("Format must be: S-1234");
        }

        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================

        // STEP 5:
        // Ask user to enter email
        System.out.println("Please inform your email: ");
        String email = scanner.nextLine();

        // STEP 6:
        // Validate email format
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z.-]+$")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
            System.out.println("Email must be in a valid format (example: name@email.com)");
        }

        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================

        // STEP 7:
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // STEP 8:
        // Count vowels using Character class
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            // access each letter of the string using charAt
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        // STEP 9:
        // Reverse sentence using StringBuilder
        StringBuilder reversed = new StringBuilder(sentence);
        reversed.reverse();

        // STEP 10:
        // Replace all digits in sentence with '*'
        String replaced = sentence.replaceAll("\\d", "*");
        System.out.println("Sentence with digits replaced: " + replaced);

        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================

        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course

        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================

        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers

        scanner.close();
    }
}
