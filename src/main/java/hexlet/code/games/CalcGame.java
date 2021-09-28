package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_QUESTIONS;
import static hexlet.code.Utils.MAXIMUM_RANDOM_VALUE;

public class CalcGame {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    private static final String[] MATHEMATICAL_SIGNS = {"+", "-", "*"};

    public static void runGame() {

        String[] arrayOfQuestions = new String[NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int a = Utils.getRandomNumber(0, MAXIMUM_RANDOM_VALUE);
            int b = Utils.getRandomNumber(0, MAXIMUM_RANDOM_VALUE);
            String operator = getRandomSign();
            arrayOfQuestions[i] = generateQuestion(a, b, operator);
            arrayOfRightAnswers[i] = generateAnswer(a, b, operator);
        }
        Engine.runGame(arrayOfQuestions, arrayOfRightAnswers, GAME_DESCRIPTION);
    }

    public static String generateQuestion(int randomNumber1, int randomNumber2, String operator) {
        return randomNumber1 + " " + operator + " " + randomNumber2;
    }


    public static String generateAnswer(int randomNumber1, int randomNumber2, String operator) {
        switch (operator) {
            case "+":
                return Integer.toString(randomNumber1 + randomNumber2);
            case "-":
                return Integer.toString(randomNumber1 - randomNumber2);
            case "*":
                return Integer.toString(randomNumber1 * randomNumber2);
            default:
                break;
        }
        return operator;
    }

    private static String getRandomSign() {
        int rndIndex = Utils.getRandomNumber(0, MATHEMATICAL_SIGNS.length);
        return MATHEMATICAL_SIGNS[rndIndex];
    }

}
