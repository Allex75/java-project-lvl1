package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProgressionGame {

    public static int progression(Scanner scanner, String name, int maximumOfRange) {
        System.out.println("What number is missing in the progression?");

        final int lengthOfProgression = 10;
        int[] array = new int[lengthOfProgression];
        int missingPos;
        StringBuilder arrayStr = new StringBuilder();
        array[0] = Utils.getRandomNumber(1, maximumOfRange);
        int progressionStep = Utils.getRandomNumber(1, maximumOfRange);

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + progressionStep;
        }
        missingPos = Utils.getRandomNumber(0, lengthOfProgression - 1);
        for (int i = 0; i < array.length; i++) {
            if (i == missingPos) {
                arrayStr.append(".. ");
            } else {
                arrayStr.append(array[i]).append(" ");
            }
        }
        String result = arrayStr.toString();
        System.out.println("Question: " + result);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        int answerNumber = parseInt(answer);
        int correctAnswer = array[missingPos];

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
