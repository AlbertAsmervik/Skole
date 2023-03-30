public class Streng2 {
    public static void main(String[] args) {
        String str1 = "Albert ";
        String str2 = "123456788";

        int length = (str1.length());
        int length2 = (str2.length());

        str1 = str1.substring(1, str1.length());
        str2 = str2.substring(1, str2.length());

       String str3 = (str1 + str2);

       System.out.print(str3);

        
        
    }
}
