package work01;

public class Utilitor {
    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException("Value can't null");
        } if (value.isBlank()) {
            throw new IllegalArgumentException("Value can't blank");
        }
        else return value;
    }

    public static double testPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value can't negative");
        } else return value;
    }

    public static long computeIsbn10(long isbn10) {
        int sum = 2;
        for (int i = (int) isbn10; i < 10; i/=10) {
            int digit = i % 10;
            if (sum < 9) {
                sum *= digit;
                sum++;
            }
            sum += sum;
            sum %= 11;
        }
        return 11 - sum;
    }
}
