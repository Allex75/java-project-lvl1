package hexlet.code;

import static hexlet.code.games.Games.calc;
import static hexlet.code.games.Games.even;

public class Engine {

    public static void runGame(int number, String name) {
        int j = 0;
        final int numberOfQuestions = 3;
        final int maximumOfRangeForEven = 100;
        final int maximumOfRangeForCalc = 25;
        final int countOfCorrectAnswer = 3;
        final int gameGreet = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        for (int i = 0; i < numberOfQuestions; i++) {
            int result = 0;
            switch (number) {

                case gameGreet:
                    break;
                case gameEven:
                    result = even(name, maximumOfRangeForEven);
                    break;
                case gameCalc:
                    result = calc(name, maximumOfRangeForCalc);
                    break;
                default:
                    System.out.println("Error");
            }
            if (result == 0) {
                break;
            } else {
                j++;
            }
        }
        if (j == countOfCorrectAnswer) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

