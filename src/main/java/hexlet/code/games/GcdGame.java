package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Utils.MAXIMUM_RANDOM_VALUE;

public class GcdGame {
     private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static String generateQuestion(int a, int b) {
        return a + " " + b;
    }

    public static String generateAnswer(int a, int b) {
        return Integer.toString(searchForGcd(a, b));
    }

    public static void runGame() {

        String[] arrayOfQuestions = new String[NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int a = Utils.getRandomNumber(1, MAXIMUM_RANDOM_VALUE);
            int b = Utils.getRandomNumber(1, MAXIMUM_RANDOM_VALUE);
            arrayOfQuestions[i] = generateQuestion(a, b);
            arrayOfRightAnswers[i] = generateAnswer(a, b);
        }
        Engine.runGame(arrayOfQuestions, arrayOfRightAnswers, GAME_DESCRIPTION);
    }

    private static int searchForGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
