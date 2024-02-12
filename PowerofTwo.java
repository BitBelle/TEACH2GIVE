package technicaltest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerofTwo{
    private static boolean isPowerOfTwo(int number) {
        // A number is a power of two if it has only one bit set
        // We use bitwise AND with (number - 1) to check if only one bit is set
        // e.g., 8 (1000) & 7 (0111) = 0, 8 is a power of two
        return number > 0 && (number & (number - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Enter a number to see if its a power of two: ");
        int number = sc.nextInt();
        
        if (isPowerOfTwo(number)){
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }

        } catch (InputMismatchException e){
            System.out.println("Please enter the right input.");
        }
        
        sc.close();


        
        
    }
    

}