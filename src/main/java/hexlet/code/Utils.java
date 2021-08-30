package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int maximumOfRangeForEven = 50;
    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max) + min;
    }
}
