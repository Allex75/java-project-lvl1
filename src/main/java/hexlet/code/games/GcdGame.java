package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GcdGame {

    public static int gcd(Scanner scanner, String name, int maximumOfRange) {
        System.out.println("Find the greatest common divisor of given numbers.");
        int a = Utils.getRandomNumber(1, maximumOfRange);
        int b = Utils.getRandomNumber(1, maximumOfRange);
        System.out.println("Question: " + a + " " + b);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        int answerNumber = parseInt(answer);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int correctAnswer = a;
        if (answerNumber == correctAnswer) {
            System.out.println("Correct!");
            return 1;
        } else {
            String str = "'" + answer + "' is wrong answer ;(. "
                    + "Correct answer was " + "'" + correctAnswer + "'" + ".\nLet's try again, " + name + "!";
            System.out.println(str);
            return 0;
        }
    }
}
