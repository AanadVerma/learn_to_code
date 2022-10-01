package number_pattern;

import java.util.Scanner;

public class NumberPattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
