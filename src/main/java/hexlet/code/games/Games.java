package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Games {

    public static int even(String name, int maximumOfRange) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rnd = Utils.getRandomNumber(0, maximumOfRange);
        System.out.println("Question: " + rnd);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine().toLowerCase();
        if (rnd % 2 == 0) {
            if (answer.equals("yes")) {
                System.out.println("Correct!");
                return 1;
            } else {
                String str = "'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was 'yes'.\nLet's try again, " + name;
                System.out.println(str);
                return 0;
            }
        } else {
            if (answer.equals("no")) {
                System.out.println("Correct!");
                return 1;
            } else {
                String str2 = "'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was 'no'.\nLet's try again, " + name + "!";
                System.out.println(str2);
                return 0;
            }
        }
    }


    public static int calc(String name, int maximumOfRange) {
        Scanner scanner = new Scanner(System.in);
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

    public static int gcd(String name, int maximumOfRange) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        int a = Utils.getRandomNumber(1, maximumOfRange);
        int b = Utils.getRandomNumber(1, maximumOfRange);
        System.out.println("Question: " + a + " " + b);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        int answerNumber = parseInt(answer);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int correctAnswer = a;
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


    public static int progression(String name, int maximumOfRange) {
        Scanner scanner = new Scanner(System.in);
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
