package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Utils.MAXIMUM_RANDOM_VALUE;
import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;

public class ProgressionGame {
    public static final int LENGTH_OF_PROGRESSION = 10;
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";


    public static String generateQuestion(int[] array, int missingPos) {
        StringBuilder arrayStr = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i == missingPos) {
                arrayStr.append(".. ");
            } else {
                arrayStr.append(array[i]).append(" ");
            }
        }
        return arrayStr.toString();
    }


    public static int[] generateProgression(int step, int firstElement, int length) {
        int[] array = new int[length];
        array[0] = firstElement;
        for (int i = 1; i < length; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }


    public static void runGame() {
        String[] questions = new String[NUMBER_OF_QUESTIONS];
        String[] answers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int progressionStep = Utils.getRandomNumber(1, MAXIMUM_RANDOM_VALUE);
            int firstElem = Utils.getRandomNumber(1, MAXIMUM_RANDOM_VALUE);
            int[] array = generateProgression(progressionStep, firstElem, LENGTH_OF_PROGRESSION);
            int missingPos = Utils.getRandomNumber(0, LENGTH_OF_PROGRESSION - 1);
            questions[i] = generateQuestion(array, missingPos);
            answers[i] = String.valueOf(array[missingPos]);
        }
        Engine.runGame(questions, answers, GAME_DESCRIPTION);
    }

}
