package number_pattern;

import java.util.Scanner;

public class NumberPattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        int count2 = 1;
        for (int i = n; i >= 1; i--) {
            count = count2;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count = count + 2;
            }
            System.out.println();
            count2 = count2 + 2;
        }
    }
}
