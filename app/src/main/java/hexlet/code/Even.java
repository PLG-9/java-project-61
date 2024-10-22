package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void launchEven() {

        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner evenOrOddSelection = new Scanner(System.in);

        var correctCount = 0;
        var countToWin = 3;

        while (correctCount < countToWin) {

            int randomNumber = (int) Math.round(Math.random() * 100);

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = evenOrOddSelection.next();

            if (randomNumber % 2 == 0 && playerAnswer.equals("yes")) {
                System.out.println("Correct!");
                correctCount++;

            } else if (randomNumber % 2 != 0 && playerAnswer.equals("no")) {
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
        } System.out.println("Congratulations, " + userName + "!");
    }
}
