package hexlet.code;

public class Utils {

    public static int generateRandomNumber(int n) {
        return (int) (Math.random() * (n + 1));
    }

    public static int generateRandomNumber(int min, int max) {
        if (max >= min) {
            return generateRandomNumber(max - min) + min;
        } else {
            return 0;
        }
    }
}
