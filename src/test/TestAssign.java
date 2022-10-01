package test;

import java.util.Scanner;

public class TestAssign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 1; i <= 2 * row - 1; i++) {

            for (int j = 1; j <= row; j++) {

                if (i == 1 || i == 2 * row - 1 || j == 1 || j == row || i == 2 * row / 2) {
                    if ((i == 1 && j == 1) || (i == 1 && j == row) || (i == row && j == row)
                            || (i == row && j == 1) || (i == 2 * row - 1 && (j == 1 || j == row))) {
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
