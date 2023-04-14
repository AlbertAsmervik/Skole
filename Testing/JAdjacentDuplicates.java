import java.util.Scanner;
public class JAdjacentDuplicates {
  public static void main(String[] args) {
    //Step 1: Read the first number that the user enters
    System.out.println("Enter the numbers separated by spaces or new line (enter -1 to quit): ");
    Scanner scan = new Scanner(System.in);
    double num = scan.nextDouble();
    //Step 2: Read the rest of the numbers that the user enters and check for adjacent duplicates
    while (num != -1) {
      double previous = num;
      num = scan.nextDouble();
      if (num == previous) {
        System.out.println("Duplicate input for number: " + num);
      }
    }
    scan.close();
  }
}
