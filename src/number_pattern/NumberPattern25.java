package number_pattern;

import java.util.Scanner;

public class NumberPattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(count);
                count++;

            }
            System.out.println();
        }
    }
}
