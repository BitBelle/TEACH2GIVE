package technicaltest;

public class FibonacciSequence {
    
    
    public static void main(String[] args) {
        int n = 100, firstNumber = 0, secondNumber = 1;
        System.out.println("This is the Fibonacci Sequence till " + n + " terms. ");
        System.out.println();

        for(int i = 1; i <= n; i++){
            System.out.print(firstNumber + ",");

            // computing the next number
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            
        }
        


        }
    }
    

