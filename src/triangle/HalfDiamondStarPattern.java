package triangle;

import java.util.Scanner;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        int row = sc.nextInt();
        int i;
        int j;
        int count = 1;

        for (i = 1; i <= 2 * row - 1; i++) {
            for (j = 1; j <= count; j++) {
                System.out.print("*");
            }

            if (i < row) {
                count++;
            } else {
                count--;
            }
            System.out.println();
        }
    }
}
