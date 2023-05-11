public class Additon {
    public static void main (String[]args) {
        int num1=10;
        int num2=20;
        int result;
        result = sum(num1, num2);
        System.out.println("result :" +result);
    }
    public static int sum(int a, int b) {
        int result;
        result= a+ b;
        return result;
    }
}
