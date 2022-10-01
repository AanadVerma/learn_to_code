package test;

import java.util.Scanner;

public class PracticeExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int count = n;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
            }
            if (i < n) {
                count--;
                space++;
            } else {
                count++;
                space--;
            }
            System.out.println();
        }
    }
}
