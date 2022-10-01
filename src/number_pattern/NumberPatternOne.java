package number_pattern;

import java.util.Scanner;

public class NumberPatternOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (i == input / 2 + 1 && j == input / 2 + 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
