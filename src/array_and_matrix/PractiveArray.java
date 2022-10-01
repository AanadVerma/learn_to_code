package array_and_matrix;

import java.util.Random;

public class PractiveArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; arr[i] = random.nextInt(10), i++) ;
        for (int i = 0; i < arr.length; System.out.println(arr[i]), i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
