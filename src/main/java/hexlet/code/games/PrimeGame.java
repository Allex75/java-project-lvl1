package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class PrimeGame {


    public static void runGame(Scanner scanner) {
        String name = App.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] arrayOfQuestions = new String[Utils.NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[Utils.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Utils.NUMBER_OF_QUESTIONS; i++) {
            int question = question();
            arrayOfQuestions[i] = String.valueOf(question);
            arrayOfRightAnswers[i] = rightAnswer(question);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, name);
    }

    public static int question() {
        return Utils.getRandomNumber(0, Utils.MAXIMUM_OF_RANGE_FOR_PRIME);
    }

    public static String rightAnswer(int num) {
        return isPrime(num) ? "yes" : "no";
    }

    private static boolean isPrime(int num) {
        if (num <= 1 || num != 2 && num % 2 == 0) {
            return false;
        } else {
            int iSqrt = (int) Math.sqrt(num);
            for (int i = 2; i <= iSqrt; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


}
