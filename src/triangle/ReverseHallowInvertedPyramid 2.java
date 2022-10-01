package triangle;

import java.util.Scanner;

public class ReverseHallowInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        int row = sc.nextInt();
        int i;
        int j;
        for (i = row; i >= 1; i--) {
            for (j = 1; j <= 2 * row - 1; j++) {
                if (i + j == row + 1 || j - i == row - 1 || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
