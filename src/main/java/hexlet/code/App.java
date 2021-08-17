package hexlet.code;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter ");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int number = sc.nextInt();
        final int gameGreet = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        final  int gameGcd = 4;
        if (number == gameGreet || number == gameEven || number == gameCalc || number == gameGcd) {
            String name = greeting();
            if (number == gameEven || number == gameCalc || number == gameGcd) {
                Engine.runGame(number, name);
            }
        }
    }

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        return Cli.getName();
    }


}
