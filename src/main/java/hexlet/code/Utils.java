package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int MAXIMUM_OF_RANGE_FOR_CALC = 25;
    public static final int MAXIMUM_OF_RANGE_FOR_GCD = 50;
    public static final int MAXIMUM_OF_RANGE_FOR_EVEN = 50;
    public static final int MAXIMUM_OF_RANGE_FOR_PROGRESSION = 20;
    public static final int MAXIMUM_OF_RANGE_FOR_PRIME = 50;

    public static final int NUMBER_OF_QUESTIONS = 3;
    public static final int COUNT_OF_CORRECT_ANSWER = 3;

    public static final int GAME_GREET = 1;
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;

    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max) + min;
    }
}
