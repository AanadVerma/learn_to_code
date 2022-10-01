package number_pattern;

import java.util.Scanner;

public class NumberPattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c1, c2;
        for (int i = 1; i <= n; i++) {
            c1 = 1;
            c2 = 2;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(c2);
                    c2 = c2 + 2;
                } else {
                    System.out.print(c1);
                    c1 = c1 + 2;
                }
            }
            System.out.println();
        }
    }
}
