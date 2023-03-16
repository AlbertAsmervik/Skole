public class ComparisonOperatorsv2 {
    public static void main(String[]args) {
        double a = 2.4;
         
        if (a == 2.4) {
            System.out.println("They are equal!");
        }
        if (a > 7) {
            System.out.println("Greater than 7");
        }
        if(a == 2.4 || a == 2.5) {
            System.out.println("a is 2.4 or 2.5");

        }
        if(a >= 0 && a <= 100) {
            System.out.println("a is in the range of 0-100");
        }

    }
}
