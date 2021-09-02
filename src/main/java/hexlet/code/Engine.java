package hexlet.code;


import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

import static hexlet.code.Utils.COUNT_OF_CORRECT_ANSWER;
import static hexlet.code.Utils.GAME_CALC;
import static hexlet.code.Utils.GAME_EVEN;
import static hexlet.code.Utils.GAME_GCD;
import static hexlet.code.Utils.GAME_GREET;
import static hexlet.code.Utils.GAME_PRIME;
import static hexlet.code.Utils.GAME_PROGRESSION;
import static hexlet.code.Utils.MAXIMUM_OF_RANGE_FOR_CALC;
import static hexlet.code.Utils.MAXIMUM_OF_RANGE_FOR_EVEN;
import static hexlet.code.Utils.MAXIMUM_OF_RANGE_FOR_GCD;
import static hexlet.code.Utils.MAXIMUM_OF_RANGE_FOR_PRIME;
import static hexlet.code.Utils.MAXIMUM_OF_RANGE_FOR_PROGRESSION;
import static hexlet.code.Utils.NUMBER_OF_QUESTIONS;

public class Engine {

    public static void runGame(Scanner scanner, int number, String name) {
        int j = 0;
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int result = 0;
            switch (number) {

                case GAME_GREET:
                    break;
                case GAME_EVEN:
                    result = EvenGame.even(scanner, name, MAXIMUM_OF_RANGE_FOR_EVEN);
                    break;
                case GAME_CALC:
                    result = CalcGame.calc(scanner, name, MAXIMUM_OF_RANGE_FOR_CALC);
                    break;
                case GAME_GCD:
                    result = GcdGame.gcd(scanner, name, MAXIMUM_OF_RANGE_FOR_GCD);
                    break;
                case GAME_PROGRESSION:
                    result = ProgressionGame.progression(scanner, name, MAXIMUM_OF_RANGE_FOR_PROGRESSION);
                    break;
                case GAME_PRIME:
                    result = PrimeGame.prime(scanner, name, MAXIMUM_OF_RANGE_FOR_PRIME);
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
        if (j == COUNT_OF_CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}

