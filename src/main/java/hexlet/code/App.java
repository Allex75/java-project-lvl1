package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {

    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;

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



        switch (number) {
            case GAME_GREET:
                Cli.sayHello(scanner);
                break;
            case GAME_EVEN:
                EvenGame.runGame();
                break;
            case GAME_CALC:
                CalcGame.runGame();
                break;
            case GAME_GCD:
                GcdGame.runGame();
                break;
            case GAME_PROGRESSION:
                ProgressionGame.runGame();
                break;
            case GAME_PRIME:
                PrimeGame.runGame();
                break;
            default:
                System.out.println("Error");
        }


    }



}
