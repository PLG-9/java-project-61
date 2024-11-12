package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the game number and press Enter.
                           1 - Greet
                           2 - Even
                           3 - Calc
                           4 - GCD
                           5 - Progression
                           6 - Prime
                           0 - Exit""");

        Scanner gameNoSelection = new Scanner(System.in);

        System.out.print("Your choice: ");
        String gameNo = gameNoSelection.next();

        switch (gameNo) {

            case "1":
                Greet.greetUser();
                break;

            case "2":
                Even.launchEven();
                break;

            case "3":
                Calc.launchCalc();
                break;

            case "4":
                GCD.launchGCD();
                break;

            case "5":
                Progression.launchProgression();

            case "6":
                Prime.launchPrime();

            case "0":
                break;

            default:
                break;
        }
    }
}
