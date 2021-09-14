package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class ProgressionGame {
    public static final int LENGTH_OF_PROGRESSION = 10;

//    public static boolean progression(Scanner scanner, String name, int maximumOfRange) {
//        System.out.println("What number is missing in the progression?");
//
//
//        int[] array = new int[lengthOfProgression];
//        int missingPos;
//        StringBuilder arrayStr = new StringBuilder();
//        array[0] = Utils.getRandomNumber(1, maximumOfRange);
//        int progressionStep = Utils.getRandomNumber(1, maximumOfRange);
//
//        for (int i = 1; i < array.length; i++) {
//            array[i] = array[i - 1] + progressionStep;
//        }
//        missingPos = Utils.getRandomNumber(0, lengthOfProgression - 1);
//        for (int i = 0; i < array.length; i++) {
//            if (i == missingPos) {
//                arrayStr.append(".. ");
//            } else {
//                arrayStr.append(array[i]).append(" ");
//            }
//        }
//        String result = arrayStr.toString();
//        System.out.println("Question: " + result);
//        System.out.print("Your answer: ");
//        String answer = scanner.nextLine();
//        int answerNumber = parseInt(answer);
//        int correctAnswer = array[missingPos];
//
//        if (answerNumber == correctAnswer) {
//            System.out.println("Correct!");
//            return true;
//        } else {
//            String str = "'" + answer + "' is wrong answer ;(. "
//                    + "Correct answer was " + "'" + correctAnswer + "'" + ".\nLet's try again, " + name + "!";
//            System.out.println(str);
//            return false;
//        }
//
//    }

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


//    public static String rightAnswer(String str) {
//        String sequence = str.trim();
//        String[] progression = sequence.split(" ");
//        int missingNumber = 0;
//        for (int i = 0; i < progression.length; i++) {
//            if ("..".equals(progression[i]) && i != 0) {
//                missingNumber = (Integer.parseInt(progression[i - 1]) + Integer.parseInt(progression[i + 1])) / 2;
//            } else if ("..".equals(progression[i])) {
//                missingNumber = 2 * Integer.parseInt(progression[i + 1]) - Integer.parseInt(progression[i + 2]);
//            }
//        }
//        return Integer.toString(missingNumber);
//    }

    public static int[] generateArray() {
        int[] array = new int[LENGTH_OF_PROGRESSION];
        array[0] = Utils.getRandomNumber(1, Utils.MAXIMUM_OF_RANGE_FOR_PROGRESSION);
        int progressionStep = Utils.getRandomNumber(1, Utils.MAXIMUM_OF_RANGE_FOR_PROGRESSION);

        for (int i = 1; i < LENGTH_OF_PROGRESSION; i++) {
            array[i] = array[i - 1] + progressionStep;
        }
        return array;
    }


    public static void runGame(Scanner scanner) {
        String name = App.greeting();
        System.out.println("What number is missing in the progression?");
        String[] arrayOfQuestions = new String[Utils.NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[Utils.NUMBER_OF_QUESTIONS];
        for (int i = 0; i < Utils.NUMBER_OF_QUESTIONS; i++) {
            int[] array = generateArray();
            int missingPos = Utils.getRandomNumber(0, LENGTH_OF_PROGRESSION - 1);
            arrayOfQuestions[i] = question(array, missingPos);
            arrayOfRightAnswers[i] = String.valueOf(array[missingPos]);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, name);
    }

}
