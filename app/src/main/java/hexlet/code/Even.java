package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void launchEven() {

        Greet.greetUser();

        int randomNumber = (int) Math.round(Math.random() * 100);

        System.out.println("""
                           Answer 'yes' if the number is even, otherwise answer 'no'.
                           Question:""" + " " + randomNumber);

        Scanner evenOrOddSelection = new Scanner(System.in);
        System.out.print("Your answer: ");
        String playerAnswer = evenOrOddSelection.next();

    }
}
