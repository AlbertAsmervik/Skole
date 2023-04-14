public class JSmallestDivisor {
    public static void main(String[] args) {
     
              //Step 1: Define the variables that we need for this program
              int num = 15;
              int divisor = 2;
              //Step 2: Find the smallest divisor of the number
              while (num % divisor != 0) {
                divisor += 1;
              }
              System.out.println("The smallest divisor of " + num + " is " + divisor);
            
          }
    }

