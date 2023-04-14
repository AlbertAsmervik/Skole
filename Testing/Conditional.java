import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int a = one.nextInt();
        int b = one.nextInt();

        int Sum = a + b;

        if  (Sum >= 10 && Sum <= 19) {
            Sum = 20;
        } 

        System.out.print(Sum);

    }
   
}