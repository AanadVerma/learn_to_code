package triangle;

import java.util.Scanner;

public class PyramidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        int row = sc.nextInt();
        int i;
        int j;
        int k;

        for (i = 1; i <= row; i++) {
            for (k = 1; k <= row - i; k++) {
                System.out.printf(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }

    }
}
