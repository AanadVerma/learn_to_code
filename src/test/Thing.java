package test;

public class Thing {

    public static void main(String[] args) {


        long result = 0;
        for (int i = 1; i <= 14; i++) {
            result = result * pow(10, getNumOfDigit(i)) + i;

        }
        System.out.println(result);

    }

    private static int getNumOfDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    private static int pow(int base, int exponent) {
        int result = 1;

        if (exponent == 0) {
            return 1;
        }
        while (exponent > 0) {
            result *= base;
            --exponent;
        }

        return result;
    }
}
