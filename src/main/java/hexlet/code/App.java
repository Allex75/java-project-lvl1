
package hexlet.code;


import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter ");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                greeting();
                break;
            case 2:
                String name = greeting();
                checkingForParity(name);
                break;
            default:
                System.out.println("Error");
        }

    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        return Cli.getName();

    }


    public static void checkingForParity(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");


        int j = 0;
        final int numberOfQuestions = 3;
        final int maximumOfRange = 3;
        final int countOfCorrectAnswer = 3;
        for (int i = 0; i < numberOfQuestions; i++) {
            int rnd = Utils.getRandomNumber(0, maximumOfRange);
            System.out.println("Question: " + rnd);
            System.out.print("Your answer: ");
            String answer = sc.nextLine().toLowerCase();

            if (rnd % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    j++;
                } else {
                    String str = "'" + answer + "' is wrong answer ;(. "
                            + "Correct answer was 'yes'.\nLet's try again, " + name;
                    System.out.println(str);
                    break;

                }

            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    j++;
                } else {
                    String str2 = "'" + answer + "' is wrong answer ;(. "
                            + "Correct answer was 'no'.\nLet's try again, " + name;
                    System.out.println(str2);
                    break;
                }
            }
        }
        if (j == countOfCorrectAnswer) {
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
