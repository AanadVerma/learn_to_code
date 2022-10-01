package number_pattern;

import java.util.Scanner;

public class NumberPattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        int num;
        for (int i = 1; i <= n; i++) {
            count = 1;
            num = i;

            for (int k = 1; k < i; k++) {
                System.out.print(num);
                num--;
            }


            for (int j = i; j <= n; j++) {
                System.out.print(count);
                count++;
            }


            System.out.println();
        }
    }
}
