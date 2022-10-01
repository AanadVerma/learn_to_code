package number_pattern;

import java.util.Scanner;

public class NumberPattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count % 2 == 1) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
                count++;

            }
            System.out.println();
        }
    }
}
