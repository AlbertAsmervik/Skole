// Given two integer variables a and b, 
// write a method public int firstMultiple(int a, int b)
// that returns the first multiple of a that is greater 
// than b. Assume that the initial value of the variables a and b are positive integers.


public class hei {

public int firstMultiple(int a, int b) {
    int multiple = a;
    while (multiple <= b) {
        multiple += a;
    }
    return multiple;

}


}

