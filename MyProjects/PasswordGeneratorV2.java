package MyProjects;

import java.security.SecureRandom;

public class PasswordGeneratorV2 {
    public static void main(String[]args){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String SpecialCHARS = "<>,.$&#*@_";
        int len = 20; // funker best med 20 karakterer

        char[] password = new char[len];
        SecureRandom r = new SecureRandom(); // nytt objekt, istedet for .random

        // sikrer et tegn fra hver kategori
        password[0] = upper.charAt(r.nextInt(upper.length()));
        password[1] = lower.charAt(r.nextInt(lower.length()));
        password[2] = num.charAt(r.nextInt(num.length()));
        password[3] = SpecialCHARS.charAt(r.nextInt(SpecialCHARS.length()));

        // fylling
        String combination = upper + lower + SpecialCHARS + num;
        for (int i = 4; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }

        // Shuffle de garanterne tegnene
        for (int i = 0; i < len; i++) {
            int randomIndex = r.nextInt(len);
            char temp = password[i];
            password[i] = password[randomIndex];
            password[randomIndex] = temp;
        }

        System.out.println(new String(password));
    }
}

