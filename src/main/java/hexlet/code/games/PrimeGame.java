package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
public class PrimeGame {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[] arrayOfQuestions = new String[NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int question = generateQuestion();
            arrayOfQuestions[i] = String.valueOf(question);
            arrayOfRightAnswers[i] = generateAnswer(question);
        }
        Engine.runGame(arrayOfQuestions, arrayOfRightAnswers, GAME_DESCRIPTION);
    }

    public static int generateQuestion() {
        return Utils.getRandomNumber(0, Utils.MAXIMUM_RANDOM_VALUE);
    }

    public static String generateAnswer(int num) {
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
