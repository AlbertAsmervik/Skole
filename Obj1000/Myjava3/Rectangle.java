import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        
        int length;
        int width;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter lenght in cm " );
        length = input.nextInt();

        System.out.print("Enter width in cm ");
        width = input.nextInt();

        area (length, width);
        perimiter (length, width);

input.close();

    }

    public static void perimiter (int length, int width) {
    
        int perimeter = 2*(width+length);
         System.out.println("Omkretsen av rektangelet er " + perimeter + " cm");

    }
    public static void area (int length, int width) {
        int area = width*length;
        System.out.println("arealet av rektangelet er " + area + " cm");
    }
}
