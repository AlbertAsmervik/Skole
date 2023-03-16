import java.util.Scanner;
public class inputmethodsv2 {
    public static void main(String[]args) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is:  " + inputDevice.nextLine()); // bare input.next om vi vil ha første ordet

    }
}
