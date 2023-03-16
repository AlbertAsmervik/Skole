
// Write a Java program that calculates the following sum for the k entered by user.
// 𝑆=1! +3! +5! +...+(2𝐾+1)!


import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of k: ");
        int k = input.nextInt();

        long sum = 0;
        long factorial = 1;

        for (int i = 1; i <= 2 * k + 1; i += 2) {
            factorial *= i * (i + 1);
            sum += factorial;
        }

        System.out.println("The sum is: " + sum);
    }
}