public class Main {
    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int divisor = 0;

        while (first > divisor) {
            divisor++;
            if (first % divisor == 0) {
                return divisor;
            }
        }
    }
}