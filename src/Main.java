public class Main {
    public static void main(String[] args) {

        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(25, 40));
        System.out.println("The greatest common divisor is " + getGreatestCommonDivisor(75, 30));


    }

    public static int getGreatestCommonDivisor(int first, int second) {

        // Check if either of the input numbers is less than 10
        if (first < 10 || second < 10) {
            // If any of the numbers is less than 10, return -1 (as per the problem's requirement)
            return -1;
        }

        // Determine the smaller of the two input numbers
        int min = first < second ? first : second;

        // Initialize the greatest common divisor (GCD) to 1
        int gcd = 1;

        // Iterate through numbers from 1 up to the minimum of the two input numbers
        for (int i = 1; i <= min; i++) {
            // Check if 'i' is a common divisor of both 'first' and 'second'
            if (first % i == 0 && second % i == 0) {
                // If 'i' is a common divisor, update the GCD to 'i'
                gcd = i;
            }
        }

        // After iterating through all potential common divisors, return the GCD
        return gcd;
    }

}