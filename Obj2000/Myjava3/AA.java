public class AA {
    public static void main(String[] args) {
        calculate(5,6.4);
    }
    public static void calculate(int a, double b) {

        System.out.println("This is first method");
    }
    public static void calculate(double b, int a) {
        System.out.println("This is second method");
    }
}
