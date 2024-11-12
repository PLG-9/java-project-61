package hexlet.code;

import java.util.Scanner;

public class Prime {
    public static void launchPrime() {

        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Scanner resultGuess = new Scanner(System.in);

        var correctCount = 0;
        var countToWin = 3;

        while (correctCount < countToWin) {

            int a = (int) Math.round(Math.random() * 100);

            System.out.println("Question: " + a);
            System.out.print("Your answer: ");
            String playerAnswer = resultGuess.next();
            String isPrime = "yes";

            if (a <= 1) {
                isPrime = "no";
            } else if (a == 2 || a == 3) {
                isPrime = "yes";
            } else if (a % 2 == 0 || a % 3 == 0) {
                isPrime = "no";
            } else {
                for (int i = 5; i <= Math.sqrt(a); i = i + 6) {
                    if (a % i == 0 || a % (i + 2) == 0) {
                        isPrime = "no";
                    }
                }
            }
                        
            if (playerAnswer.equals(isPrime)) {
                System.out.println("Correct!");
                correctCount++;

            } else {
                switch (playerAnswer) {
                    case "yes":
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.println("Let's try again, " + userName + "!");
                        return;

                    case "no":
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again, " + userName + "!");
                        return;

                    default:
                        System.out.println("Please answer 'yes' or 'no' only.");
                        System.out.println("Let's try again, " + userName + "!");
                        return;
                    }
                }
        System.out.println("Congratulations, " + userName + "!");
        }
    }
}