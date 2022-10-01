package test;

import java.util.Scanner;

public class EightPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == 2 * n - 1 || i == n || j == 1 || j == n) {
                    if ((i == 1 && j == 1) || (i == 1 && j == n) || (i == n && j == 1) || (i == n && j == n) || (i == 2 * n - 1 && j == 1) || (i == 2 * n - 1 && j == n)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
