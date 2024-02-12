// Question 6: Count Vowels
// Write a program that counts the number of vowels in a sentence.


// package technicaltest;

import java.util.Scanner;

public class CountVowels {

     // Method to count the number of vowels in a string
     public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Call the countVowels method to count the vowels
        int vowelCount = countVowels(inputString);

        // Print the count of vowels
        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }

   
}

    

