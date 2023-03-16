import java.util.Scanner;

public class SwitchSystem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Which year are you in the unicersity");
        year = input.nextInt();
        switch(year) {
            case 1 :
                System.out.println("Freshamn");
            break;
            case 2:
                System.out.println("Sophomore");
            break;
            case 3:
                System.out.println("Junior");
            break;
            case 4:
                System.out.println("Senior");
            break;
            default:
                System.out.println("Invalid year");
            
            
        }
    }
}
