package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int MAXIMUM_RANDOM_VALUE = 50;

    public static final int NUMBER_OF_QUESTIONS = 3;


    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max) + min;
    }
}
