import java.util.Scanner;

public class ShapeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the shape Generator toolkit!");
         // Prompt the user to enter a letter for the desired shape

        System.out.print("Enter a letter to print a shape (S for square, T for triangle, R for rectangle): ");
        String shape = scanner.nextLine();

        // Use a switch statement to determine which shape to print based on the user's input
        switch (shape) {
            case "S":
            // If the user chose a square, prompt them to enter the size of the square and call the printSquare method
                System.out.print("Enter the size of the square: ");
                int size = scanner.nextInt();
                printSquare(size);
                break;
            case "T":
            // If the user chose a triangle, prompt them to enter the height of the triangle and call the printTriangle method
                System.out.print("Enter the height of the triangle: ");
                int height = scanner.nextInt();
                printTriangle(height);
                break;
            case "R":
             // If the user chose a rectangle, prompt them to enter the length and height of the rectangle and call the printRectangle method
                System.out.print("Enter the length of the rectangle: ");
                int length = scanner.nextInt();
                System.out.print("Enter the height of the rectangle: ");
                int rectHeight = scanner.nextInt();
                printRectangle(length, rectHeight);
                break;
            default:
            // If the user entered an invalid input, let them know and end the program
                System.out.println("Invalid input. Please enter S, T or R.");
                break;

            
        }
    }
    // Method to print a square of a given size
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) { // 
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();  //  for Space between
        }
    }
    // Method to print a Triangle of a given size
    public static void printTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Method to print a Rectangle of a given height and lenght
    public static void printRectangle(int length, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
