package hexlet.code;

import java.util.List;
import java.util.Scanner;

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

        final int gameGreet = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGcd = 4;
        final int gameProgression = 5;
        final int gamePrime = 6;
        List<Integer> games = List.of(gameGreet, gameEven, gameCalc, gameGcd, gameProgression, gamePrime);
        if (games.contains(number)) {
            String name = greeting();
            Engine.runGame(scanner, number, name);
        }
    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        return Cli.getName();
    }
}
