package technicaltest;

public class FizzBuzz{

    public static void main(String[] args) {
        System.out.println("Lets count numbers from 1 to 100");
        
        for(int number = 1; number <= 100; number++){
            
            if(number % 3 == 0){
                System.out.print(number + " ");
                System.out.println("Fizz");
            } else if (number % 5 == 0){
                System.out.print(number + " ");
                System.out.println("Buzz");
            } else if((number % 3 == 0) && (number % 5 == 0)){
                System.out.print(number + " ");
                System.out.println("FizzBuzz");
            } else{
                System.out.println(number);
            }
        }
    }
}