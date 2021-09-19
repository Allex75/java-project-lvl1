package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GcdGame {
     private static  String gameDescription = "Find the greatest common divisor of given numbers.";

    public static String question() {
        int a = Utils.getRandomNumber(1, Utils.MAXIMUM_RANDOM_VALUE);
        int b = Utils.getRandomNumber(1, Utils.MAXIMUM_RANDOM_VALUE);
        return a + " " + b;
    }

    public static String rightAnswer(String expression) {
        String[] numbers = expression.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return Integer.toString(a);
    }

    public static void runGame(Scanner scanner) {

        String[] arrayOfQuestions = new String[Utils.NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[Utils.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Utils.NUMBER_OF_QUESTIONS; i++) {
            arrayOfQuestions[i] = question();
            arrayOfRightAnswers[i] = rightAnswer(arrayOfQuestions[i]);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, gameDescription);
    }
}
