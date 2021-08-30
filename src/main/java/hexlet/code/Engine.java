package hexlet.code;

import static hexlet.code.games.Games.calc;
import static hexlet.code.games.Games.even;
import static hexlet.code.games.Games.gcd;
import static hexlet.code.games.Games.progression;

public class Engine {

    public static void runGame(int number, String name) {
        int j = 0;


        final int maximumOfRangeForCalc = 25;
        final int maximumOfRangeForGcd = 50;
        final int maximumOfRangeForProgression = 20;
        final int maximumOfRangeForEven = 50;
        final int numberOfQuestions = 3;
        final int countOfCorrectAnswer = 3;
        final int gameGreet = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGcd = 4;
        final int gameProgression = 5;
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
                case gameGcd:
                    result = gcd(name, maximumOfRangeForGcd);
                    break;
                case gameProgression:
                    result = progression(name, maximumOfRangeForProgression);
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

