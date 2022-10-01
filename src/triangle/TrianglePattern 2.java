package triangle;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        int i, j;
        for (i = row; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
