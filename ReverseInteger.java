// Question 5: Reverse Integer
// Write a program that takes an integer as input and returns an integer with reversed digit
// ordering.

// package technicaltest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInteger {

     // Method to reverse a number
     public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        // Reverse the number using a loop
        while (number != 0) {
            int digit = number % 10; // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Add the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the reverseNumber method to get the reversed number
        int reversedNumber = reverseNumber(number);

        // Print the reversed number
        System.out.println("The reversed number: " + reversedNumber);
    } catch(InputMismatchException e){
        System.out.println("Please provide a valid input.");
    }
        sc.close();
     }

    
   
}


