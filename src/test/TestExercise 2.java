package test;

import java.util.Scanner;

public class TestExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = count; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = n; j >= count; j--) {
                System.out.print("*");
            }

            if (i >= n) {
                count--;

            } else {
                count++;
            }
            System.out.println();
        }
    }
}
