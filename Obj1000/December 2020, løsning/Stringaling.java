// Write a method
// public String specialConcatenate(String str1, String str2)
// that will concatenate the two strings without including the 
// first character of each of them. The method should return the resulting string.
//  Assume that the initial value of
// variables str1 and str2 are with at least one character.

public class Stringaling {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String result = specialConcatenate(str1, str2);
        System.out.println(result); // ellohere

        str1 = "java";
        str2 = "code";
        result = specialConcatenate(str1, str2);
        System.out.println(result); // avaode

        str1 = "shotl";
        str2 = "java";
        result = specialConcatenate(str1, str2);
        System.out.println(result); // hotlava
    }

    public static String specialConcatenate(String str1, String str2) {
        String result = str1.substring(1) + str2.substring(1);
        return result;
    }
}

