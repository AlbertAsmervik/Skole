public class NumbersDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        DisplayTwiceTheNumber(a,b);
        DisplayNumbersPlusFive(a, b);
        DisplayNumbersSquared(a, b);
    
    }
    public static void DisplayTwiceTheNumber(int a, int b) {
        int result1 = a*2;
        int result2 = b*2;
        System.out.println("Det dobbelte av tallet 5 er "+ result1);
        System.out.println("Det dobbelte av tallet 10 er "+ result2);

        

    }
    public static void DisplayNumbersPlusFive(int a, int b) {
        int result1 = a+5;
        int result2 = b+5;
        System.out.println("5 pluss 5 = "+ result1);
        System.out.println("10 pluss 5 = "+ result2);
    }
    public static void DisplayNumbersSquared(int a, int b) {
        int result1 = a*5;
        int result2 = b*10;
        System.out.println("5 ganger 5 = "+ result1);
        System.out.println("10 ganger 10 = "+ result2);
    }
   

    
    

}
