package triangle;

import java.util.Scanner;

public class TrianglePatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row || i == j || i + j == row + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
