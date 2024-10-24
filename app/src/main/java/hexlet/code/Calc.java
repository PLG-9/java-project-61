package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void launchCalc() {
        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");

        Scanner resultGuess = new Scanner(System.in);

        var correctCount = 0;
        var countToWin = 3;

        while (correctCount < countToWin) {

            String[] operators = {"+", "-", "*"};

            int randomNumber1 = (int) Math.round(Math.random() * 100);
            int randomNumber2 = (int) Math.round(Math.random() * 100);
            int operatorNumber = (int) Math.round(Math.random() * (operators.length - 1));
            String operator = operators[operatorNumber];

            System.out.println("Question: " + randomNumber1 + " " + operator + " " + randomNumber2);
            System.out.print("Your answer: ");
            String playerAnswer = resultGuess.next();

            if (operator.equals("+") && playerAnswer.equals(Integer.toString(randomNumber1 + randomNumber2))) {
                System.out.println("Correct!");
                correctCount++;
            } else if (operator.equals("-") && playerAnswer.equals(Integer.toString(randomNumber1 - randomNumber2))) {
                System.out.println("Correct!");
                correctCount++;
            } else if (operator.equals("*") && playerAnswer.equals(Integer.toString(randomNumber1 * randomNumber2))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                if (operator.equals("+")) {
                    System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '" + (randomNumber1 + randomNumber2) + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                } else if (operator.equals("-")) {
                    System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '" + (randomNumber1 - randomNumber2) + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                } else {
                    System.out.println("Let's try again, " + userName + "!");
                    System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '" + (randomNumber1 * randomNumber2) + "'");
                    return;
                }
            }
        } System.out.println("Congratulations, " + userName + "!");
    }
}
