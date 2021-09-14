package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Utils.NUMBER_OF_QUESTIONS;

public class EvenGame {


    public static int question() {
        return Utils.getRandomNumber(0, Utils.MAXIMUM_OF_RANGE_FOR_EVEN);
    }

    public static String rightAnswer(int num) {
        return isEven(num) ? "yes" : "no";
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void runGame(Scanner scanner) {
        String name = App.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        String[] arrayOfQuestions = new String[NUMBER_OF_QUESTIONS];
        String[] arrayOfRightAnswers = new String[NUMBER_OF_QUESTIONS];
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int question = question();
            arrayOfQuestions[i] = String.valueOf(question);
            arrayOfRightAnswers[i] = rightAnswer(question);
        }
        Engine.runGame(scanner, arrayOfQuestions, arrayOfRightAnswers, name);
    }
}
