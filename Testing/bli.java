import java.util.Scanner;

public class bli {
    public static void main(String[] args) {
        // Step 1: Receive the weight and height from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight in kilograms:");
        double weight = scan.nextDouble();
        System.out.println("Enter the height in centimeters:");
        double height = scan.nextDouble();
        scan.close();
        
        // Step 2: Convert height from centimeters to meters
        double heightInMeters = height / 100.0;
        
        // Step 3: Calculate BMI
        double bmi = weight / Math.pow(heightInMeters, 2);
        
        // Step 4: Print the result
        System.out.println("The BMI is: " + bmi);
    }
}

