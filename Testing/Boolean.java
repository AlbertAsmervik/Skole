import java.util.Scanner;


public class Boolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter whether it is too hot (true or false):");
        boolean tooHot = scan.nextBoolean();
        System.out.println("Enter whether it is too dry (true or false):");
        boolean tooDry = scan.nextBoolean();
        scan.close();
        //Step 2: Write the boolean expression to determine whether it is both too hot and too dry
        boolean value = tooHot && tooDry;
        System.out.println(value + ", The weather is not both too hot and too dry");
      }
    }
