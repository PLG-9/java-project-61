package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the game number and press Enter.
                           1 - Greet
                           0 - Exit""");

        Scanner gameNoSelection = new Scanner(System.in);

        System.out.print("Your choice: ");
        String gameNo = gameNoSelection.next();

        switch (gameNo) {

            case "1":
                System.out.println("\nWelcome to the Brain Games!");

                Scanner userNameSelection = new Scanner(System.in);

                System.out.print("May I have your name? ");
                String userName = userNameSelection.next();
                System.out.println("Hello, " + userName + "!");

                gameNoSelection.close();
                userNameSelection.close();

                break;

            case "0":
                break;

            default:
                break;
        }
    }
}
