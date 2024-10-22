package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void greetUser() {
        System.out.println("\nWelcome to the Brain Games!");

        Scanner userNameSelection = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = userNameSelection.next();
        System.out.println("Hello, " + userName + "!");

    }
}
