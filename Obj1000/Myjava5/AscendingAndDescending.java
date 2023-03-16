import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {

        
        
         Scanner scan  = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scan.nextInt() ;
        int b = scan.nextInt() ;
        int c = scan.nextInt() ;


         if (a > b && b > c ) {
            System.out.println( a + " Is the greatest number "+b+" is the second highest "+c+ " is the lowest number");
         }  
         else if ( a > c && c > b) {
            System.out.println( a + " is the greatest number" +c+ " is the second highest "+b+" is the lowest number");

         }
         else if (c > a && a >b){
            System.out.println( c + " is the greatest number" +a+" is the second highest "+b+" is the lowest number");

         }
         else if (c > b && b > a){
            System.out.println( c + " is the greatest number" +b+" is the second highest "+a+" is the lowest number");

         } else if (b > a && a >b){
            System.out.println( b + " is the greatest number" +a+" is the second highest "+c+" is the lowest number");

         } else {
            System.out.println( b + " is the greatest number" +c+" is the second highest "+a+" is the lowest number");
         }
         
       
    
        
    }
}
