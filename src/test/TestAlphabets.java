package test;

import java.util.Scanner;

public class TestAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if ((i == 1 && j == 1) || (i == row && j == 1)) {
                    System.out.print(" ");
                }
                if (j == 1 || i == 1 || i == row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
