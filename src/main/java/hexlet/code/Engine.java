package hexlet.code;


import java.util.Scanner;

import static hexlet.code.Utils.NUMBER_OF_QUESTIONS;

public class Engine {


    public static void runGame(Scanner scanner, String[] questions, String[] rightAnswers, String name) {


        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(rightAnswers[i])) {
                System.out.println("Correct!");

                if (i == NUMBER_OF_QUESTIONS - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }
}

