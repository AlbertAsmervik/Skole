// The greatest common devisor (gcd) of numbers is the largest positive
//  integer that divides each of the integers. Write a Java method that 
//  returns value of gcd.
// public int gcd(int a, int b, int c)

public class gcdfinder {
    public static int gcd(int a, int b, int c) {
        // Find gcd of a and b
        int gcd = findGcd(a, b);
    
        // Find gcd of gcd and c
        gcd = findGcd(gcd, c);
    
        // Return the final gcd
        return gcd;
    }
    
    // Helper method to find gcd of two numbers
    public static int findGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGcd(b % a, a);
    }
}
