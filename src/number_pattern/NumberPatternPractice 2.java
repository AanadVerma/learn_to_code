package number_pattern;


import java.util.Scanner;

public class NumberPatternPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count, rem;
        for (int i = 1; i <= input; i++) {
            count = i;
            rem = i;
            for (int j = 1; j <= input; j++) {

                if (count <= input) {
                    System.out.print(count);
                    count++;
                } else {
                    rem--;
                    System.out.print(rem);

                }

            }


            System.out.println();
        }
    }
}
