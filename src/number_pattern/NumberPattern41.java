package number_pattern;

import java.util.Scanner;

public class NumberPattern41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(count);
                if (j < i) {
                    count = count + 2;
                } else {
                    count = count - 2;
                }
            }
            System.out.println();
        }
    }
}
