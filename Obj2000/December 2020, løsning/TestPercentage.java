// Write a Java program to calculate the percentage of the correctly answered questions on a student’s test,
//  given the total number of questions on the test and the number of questions the student got right.
// The total number of questions on the test and the number of questions the student got right should 
// be given to the user to input and later stored in the variables totalQuestions and numRight, 
// respectively. Also, note that the percentage should include the fractional part.

// 10 Poeng

import java.util.Scanner;

public class TestPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of questions on the test: ");
        int totalQuestions = scanner.nextInt();

        System.out.print("Enter the number of questions the student got right: ");
        int numRight = scanner.nextInt();

        double percentage = ((double) numRight / totalQuestions) * 100;

        System.out.printf("The student answered %.1f%% of the questions correctly.\n", percentage);
    }
}


