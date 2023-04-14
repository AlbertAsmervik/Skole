public class JStringEqual2 {
    public static void main(String[] args) {
      //Step 1: Define the strings
      String str1 = "HELLO WORLD!";
      String str2 = "hexxo worxd!";
      //Step 2: Modify the string "hexxo worxd!" to match (ignoring case) the string "HELLO WORLD!"
      str1= str1.toLowerCase();
      str2 = str2.replace("x","l");

      System.out.println(str2);
      System.out.println(str2.equals(str1));
    }
  }