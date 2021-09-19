package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class ProgressionGame {
    public static final int LENGTH_OF_PROGRESSION = 10;
    private static  String gameDescription = "What number is missing in the progression?";


    public static String question(int[] array, int missingPos) {
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


    public static int[] generateArray() {
        int[] array = new int[LENGTH_OF_PROGRESSION];
        array[0] = Utils.getRandomNumber(1, Utils.MAXIMUM_RANDOM_VALUE);
        int progressionStep = Utils.getRandomNumber(1, Utils.MAXIMUM_RANDOM_VALUE);

        for (int i = 1; i < LENGTH_OF_PROGRESSION; i++) {
            array[i] = array[i - 1] + progressionStep;
        }
        return array;
    }


    public static void runGame(Scanner scanner) {

        String[] arrayOfQuestions = new String[Utils.NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[Utils.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Utils.NUMBER_OF_QUESTIONS; i++) {
            int[] array = generateArray();
            int missingPos = Utils.getRandomNumber(0, LENGTH_OF_PROGRESSION - 1);
            arrayOfQuestions[i] = question(array, missingPos);
            arrayOfRightAnswers[i] = String.valueOf(array[missingPos]);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, gameDescription);
    }

}
