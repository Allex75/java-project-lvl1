package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.NUMBER_OF_QUESTIONS;

public class EvenGame {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static int generateQuestion() {
        return Utils.getRandomNumber(0, Utils.MAXIMUM_RANDOM_VALUE);
    }

    public static String generateAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

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
}
