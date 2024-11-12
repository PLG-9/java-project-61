package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void launchProgression() {

        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What number is missing in the progression?");

        Scanner resultGuess = new Scanner(System.in);

        var correctCount = 0;
        var countToWin = 3;

        while (correctCount < countToWin) {

            int[] numbers = new int[10];
            numbers[0] = (int) Math.round(Math.random() * 20);
            int step = (int) Math.round(Math.random() * 20);
            int hidden = (int) Math.round(Math.random() * (numbers.length - 1));

            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = numbers[i-1] + step;
            }

            String[] rawProgression = Arrays.toString(numbers).split("[\\[\\]]")[1].split(", ");
            rawProgression[hidden] = "..";
            String finalProgression = Arrays.toString(rawProgression).replaceAll("\\[|]|\\s", "").replaceAll(",", " ");

            System.out.println("Question: " + finalProgression);
            System.out.print("Your answer: ");
            String playerAnswer = resultGuess.next();

            if (playerAnswer.equals(Integer.toString(numbers[hidden]))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '" + numbers[hidden] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        } System.out.println("Congratulations, " + userName + "!");
    }
}
