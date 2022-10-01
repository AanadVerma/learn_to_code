package triangle;

import java.util.Scanner;

public class TrianglePatternSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = row; j >= 1; j--) {
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
