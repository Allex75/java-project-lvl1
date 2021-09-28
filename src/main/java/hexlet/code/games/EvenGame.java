package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

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

        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int question = generateQuestion();
            questions[i] = String.valueOf(question);
            answers[i] = generateAnswer(question);
        }
        Engine.runGame(questions, answers, GAME_DESCRIPTION);
    }
}
