package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void launchGCD() {

        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        Scanner resultGuess = new Scanner(System.in);

        var correctCount = 0;
        var countToWin = 3;

        while (correctCount < countToWin) {

            int a = (int) Math.round(Math.random() * 100);
            int b = (int) Math.round(Math.random() * 100);

            System.out.println("Question: " + a + " " + b);
            System.out.print("Your answer: ");
            String playerAnswer = resultGuess.next();

            while (a != 0 && b != 0) {
                if (a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            } int gcd = (a + b);

            if (playerAnswer.equals(Integer.toString(gcd))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '" + gcd + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        } System.out.println("Congratulations, " + userName + "!");
    }
}