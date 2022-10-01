package number_pattern;

import java.util.Scanner;

public class NumberPattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        for (int i = n; i >= 1; i--) {
            count = i;
            for (int j = i; j >= 1; j--) {
                System.out.print(count);
                count++;

            }
            System.out.println();
        }
    }
}
