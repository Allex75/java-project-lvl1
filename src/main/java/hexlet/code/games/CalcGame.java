package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalcGame {

    public static int calc(Scanner scanner, String name, int maximumOfRange) {
        System.out.println("What is the result of the expression?");
        String[] mathematicalSigns = {" + ", " - ", " * "};
        int rndIndex = Utils.getRandomNumber(0, mathematicalSigns.length);
        String rndChar = mathematicalSigns[rndIndex];
        int randomNumber1 = Utils.getRandomNumber(0, maximumOfRange);
        int randomNumber2 = Utils.getRandomNumber(0, maximumOfRange);
        String rndExpression = randomNumber1 + rndChar + randomNumber2;
        System.out.println("Question: " + rndExpression);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        int answerNumber = parseInt(answer);
        int correctAnswer;
        switch (rndChar) {
            case " + ":
                correctAnswer = randomNumber1 + randomNumber2;
                break;
            case " - ":
                correctAnswer = randomNumber1 - randomNumber2;
                break;
            case " * ":
                correctAnswer = randomNumber1 * randomNumber2;
                break;
            default:
                correctAnswer = 0;
        }
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
