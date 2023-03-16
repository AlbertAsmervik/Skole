import java.util.Scanner;
public class eggs {
public static void main(String[] args) {
final double pricePerDozen = 3.25;
final double pricePerEgg = 0.45;
final int eachDozen=12;
int numberEgg;
int dozen;
int looseEgges;
Scanner input = new Scanner(System.in);
System.out.println("Enter the number eggs you want purchase");
numberEgg = input.nextInt();
dozen = numberEgg / eachDozen;
looseEgges = numberEgg % 12;
double priceDozen = pricePerDozen * dozen;
double priceLoose = pricePerEgg * looseEgges;
double TotalPrice = priceDozen + priceLoose;
System.out.println("Thats " + dozen + " dozen at $3.25 per dozen and " 
+ looseEgges
+ " loose egges at $0.45 cent each.And total Price is: $" +
TotalPrice + ".");
}
}