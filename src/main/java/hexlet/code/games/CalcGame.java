package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Utils.MAXIMUM_RANDOM_VALUE;
import static hexlet.code.Utils.NUMBER_OF_QUESTIONS;

public class CalcGame {
    private static String gameDescription = "What is the result of the expression?";

    public static void runGame(Scanner scanner) {

        String[] arrayOfQuestions = new String[NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            arrayOfQuestions[i] = question();
            arrayOfRightAnswers[i] = rightAnswer(arrayOfQuestions[i]);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, gameDescription);
    }

    public static String question() {
        return Utils.getRandomNumber(0, MAXIMUM_RANDOM_VALUE)
                + " " + mathematicalSigns() + " "
                + Utils.getRandomNumber(0, MAXIMUM_RANDOM_VALUE);
    }


    public static String rightAnswer(String expression) {
        String[] partsOfExpression = expression.split(" ");
        int randomNumber1 = Integer.parseInt(partsOfExpression[0]);
        int randomNumber2 = Integer.parseInt(partsOfExpression[2]);
        String operator = partsOfExpression[1];
        switch (operator) {
            case "+":
                return Integer.toString(randomNumber1 + randomNumber2);
            case "-":
                return Integer.toString(randomNumber1 - randomNumber2);
            default:
                return Integer.toString(randomNumber1 * randomNumber2);


        }
    }

    private static String mathematicalSigns() {
        String[] mathematicalSigns = {"+", "-", "*"};
        int rndIndex = Utils.getRandomNumber(0, mathematicalSigns.length);
        return mathematicalSigns[rndIndex];
    }

}
