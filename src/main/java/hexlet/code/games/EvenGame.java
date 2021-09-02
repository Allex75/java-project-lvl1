package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

public class EvenGame {

    public static int even(Scanner scanner, String name, int maximumOfRange) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rnd = Utils.getRandomNumber(0, maximumOfRange);
        System.out.println("Question: " + rnd);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine().toLowerCase();
        if (rnd % 2 == 0) {
            if (answer.equals("yes")) {
                System.out.println("Correct!");
                return 1;
            } else {
                String str = "'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was 'yes'.\nLet's try again, " + name + "!";
                System.out.println(str);
                return 0;
            }
        } else {
            if (answer.equals("no")) {
                System.out.println("Correct!");
                return 1;
            } else {
                String str2 = "'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was 'no'.\nLet's try again, " + name + "!";
                System.out.println(str2);
                return 0;
            }
        }
    }
}
