package hexlet.code;


import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_QUESTIONS = 3;

    public static void runGame(String[] questions, String[] rightAnswers, String gameDescription) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

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

