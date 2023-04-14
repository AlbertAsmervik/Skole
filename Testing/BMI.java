import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight in pounds ");
        Double weight = scan.nextDouble();

        System.out.print("How tall are you in inches: ");
        Double height = scan.nextDouble();
        

        double bmi = weight/ Math.pow(height, 2) * 703;

        System.out.print("The BMI is " + bmi );

        double answer = bmi;

        if (answer < 18.5) {
            System.out.println ("You are underweight");
        }
      
    
        
        
    }
}