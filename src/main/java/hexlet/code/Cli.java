package hexlet.code;

import java.util.Scanner;
public class Cli {



    public static void name() {

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String str = sc.nextLine();
        System.out.println("Hello, " + str);




    }
}