package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.List;
import java.util.Scanner;

import static hexlet.code.Utils.GAME_CALC;
import static hexlet.code.Utils.GAME_EVEN;
import static hexlet.code.Utils.GAME_GCD;
import static hexlet.code.Utils.GAME_GREET;
import static hexlet.code.Utils.GAME_PRIME;
import static hexlet.code.Utils.GAME_PROGRESSION;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter ");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int number = Integer.parseInt(scanner.nextLine());


        List<Integer> games = List.of(GAME_GREET, GAME_EVEN, GAME_CALC, GAME_GCD, GAME_PROGRESSION, GAME_PRIME);
        switch (number) {
            case GAME_GREET:
                greeting();
                break;
            case GAME_EVEN:
                EvenGame.runGame(scanner);
                break;
            case GAME_CALC:
                CalcGame.runGame(scanner);
                break;
            case GAME_GCD:
                GcdGame.runGame(scanner);
                break;
            case GAME_PROGRESSION:
                ProgressionGame.runGame(scanner);
                break;
            case GAME_PRIME:
                PrimeGame.runGame(scanner);
                break;
            default:
                System.out.println("Error");
        }


    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        return Cli.getName();
    }
}
