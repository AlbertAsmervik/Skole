public class JCharAt2 {
    public static void main(String[] args) {
      //Given a string variable str, complete the following code in order to swap the first and last character of the string str. Assume that the initial value of variable str is already set to a string with at least two characters.

// E.g. 1: if the initial value of str is "Hello", the updated value of str will be oellH .
// E.g. 2: if the value of str is "Yummy", the updated value of str will be yummY.

      String str = "ChatGPT";
      int length = str.length();
      char ch1 = str.charAt(0);
      char ch2 = str.charAt(length-1);

      
      str = str.substring(1, str.length()-1);

      
      
      System.out.println(ch2);
      System.out.println(ch1);
      System.out.println(str);
      
      System.out.println(ch2 + str + ch1);
      


    
    }
  }