import java.util.Scanner;
public class bli {
  public static void main(String[] args) {
    //Step 1: Receive the weight and height from the user
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the weight in pounds:");
    double weight = scan.nextDouble();
    System.out.println("Enter the height in inches:");
    double height = scan.nextDouble();
    scan.close();
    //Step 2: Calculate BMI
    double bmi = weight / Math.pow(height, 2) * 703;
    //Step 3: Print the result
    System.out.println("The BMI is: " + bmi);
  }
}
