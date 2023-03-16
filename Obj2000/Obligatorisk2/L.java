import java.util.Scanner;

public class L {
    
    public static void main(String[] args) {
        
        int width;
        int height; 
        int size;
        char type;

    

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Shape Generator toolkit");
        System.out.print("Select the shape to print - (T)riangle, (S)quare, (R)ectangle "  );
         type = (char) input.nextInt();


        System.out.print("Select" +type+ "size");
        width = input.nextInt();

      Triangle(args);
      Rectangle(args);
      Square(args);

      input.close();
    }

    public static void Triangle(String[] args) {
        int Triangle;
        

    }

    public static void Rectangle(String[] args) {
        int Rectangle;
    }

    public static void Square(String[] args) {
        int Square;
    }
}