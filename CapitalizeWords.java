// Question 4: Capitalize Words
// Write a program that accepts a string as input, capitalizes the first letter of each word in the
// string, and then returns the result string.

// package technicaltest;

import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {
        System.out.println("Welcome to our title case program.");
        System.out.println("Enter any sentence and I'll convert it to title case: ");

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        // Convert the sentence to title case
        String titleCaseSentence = toTitleCase(sentence);

        // Print the sentence in title case
        System.out.println("Here is the Title Case: " + titleCaseSentence);

        scanner.close(); // Close the scanner
    }

    public static String toTitleCase(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence; // Returns unchanged if the sentence is null or empty
        }

        StringBuilder titleCaseSentence = new StringBuilder();
        String[] words = sentence.split("\\s+"); // Split the sentence into words

        for (String word : words) {
            if (!word.isEmpty()) { // Skip empty words
                char firstChar = Character.toUpperCase(word.charAt(0)); // Capitalize the first letter
                String rest = word.substring(1).toLowerCase(); // Convert the rest to lowercase
                titleCaseSentence.append(firstChar).append(rest).append(" "); // Append the word to the title case sentence
            }
        }

        return titleCaseSentence.toString().trim(); // Remove trailing whitespace and return
    }
}
