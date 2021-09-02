package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

public class PrimeGame {

    public static int prime(Scanner scanner, String name, int maximumOfRange) {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rndNumber = Utils.getRandomNumber(0, maximumOfRange);
        System.out.println("Question: " + rndNumber);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine().toLowerCase();
        if (isPrime(rndNumber)) {
            if (answer.equals("yes")) {
                System.out.println("Correct!");
                return 1;
            } else {
                String str = "'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was 'yes'.\nLet's try again, " + name;
                System.out.println(str);
                return 0;
            }
        } else  {
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


    private static boolean isPrime(int num) {
        if (num <= 1 || num != 2 && num % 2 == 0) {
            return false;
        } else {
            int iSqrt = (int) Math.sqrt(num);
            for (int i = 2; i <= iSqrt; i++) {
                if (num % i == 0) {
                    return false;

                }
            }
            return true;
        }
    }
}
