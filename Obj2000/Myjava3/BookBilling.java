import java.util.Scanner;

import javax.lang.model.type.UnionType;

public class BookBilling {
    public static void main(String[] args) 
    {
      double numberBooks;
     double couponValue; 
     
    
      

      Scanner input = new Scanner(System.in);
      System.out.print("How many books did you order " );
      numberBooks= input.nextDouble();

      System.out.print(" Hvor mye er kupongen din verdt? ");
      couponValue = input.nextDouble();
        
      double bill = ComputeBill(numberBooks, couponValue);
System.out.print("Din totale sum er " + bill );
}
public static double ComputeBill() {
    double tax = 0.08; 
    double unit = 14.99;
    return unit+(unit*tax);

}


public static double ComputeBill(double numberBooks) {
    double tax = 0.08; 
    double unit = 14.99 * numberBooks;
    return unit+(unit*tax);

}

public static double ComputeBill(double numberBooks , double couponValue ) {
    double tax = 0.08; 
    double unit = 14.99 * numberBooks;
    return unit+(unit*tax) - couponValue;

}

}

