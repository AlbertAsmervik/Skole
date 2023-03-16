public class calculation {
    public static void main(String[]args) 
    {
     int a=10;
    int b=20;
    int c=30;
    double s= 10.5;
    int result;
    sum(a, s);
    }
    public static void sum (int a, int b)

    {
        int result;
        result=a+b;
        System.out.println("sum is:" + result);
    }

    public static void sum(int a, int b, int c)
    {
        int result;
        result=a+b+c;
        System.out.println("sum is:" + result);

    }
    public static void sum(int a, double s)
    {
        double result;
        result = a+s;
        System.out.println("the sum is:"+ result);

    }


    
}
