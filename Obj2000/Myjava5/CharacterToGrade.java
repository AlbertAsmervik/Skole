import java.util.Scanner;

public class CharacterToGrade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char grade;
        System.out.println("what grade did you recive");
        grade = input.next().toUpperCase().charAt(0);
        switch(grade) {
            case 'A' :
                System.out.println('6');
            break;
            case 'B':
                System.out.println('5');
            break;
            case 'C':
                System.out.println('4');
            break;
            case 'D':
                System.out.println('3');
            break;
            case 'E':
                System.out.println('2');
            break;

            case 'F':
                System.out.println('1');
            break;


            default:
                System.out.println("Invalid year");
            
            
        }
    }
}