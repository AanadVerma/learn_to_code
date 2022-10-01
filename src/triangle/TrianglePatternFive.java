package triangle;

import java.util.Scanner;

public class TrianglePatternFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row");
        int row = sc.nextInt();
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = row; j >= i; j--) {
                System.out.print("-");
            }
            for (j = 1; j <= row; j++) {
                if (j == 1 || i == 1 || j == row || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
