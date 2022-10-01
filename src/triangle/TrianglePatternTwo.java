package triangle;

import java.util.Scanner;

public class TrianglePatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
