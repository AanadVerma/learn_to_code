package array_and_matrix;

import java.util.Random;

public class ReadAndPrintElement {
    public static void main(String[] args) {
        int index = 0;
        Random r = new Random();
        int[] arr = {56, 64, 83, 17, 48, 33, 55, 83, 24, 16};
        int max = arr[0];
        int max2 = arr[0];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(100);
//        }
        System.out.print("Array value is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        int temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.print("Max number is " + max);

        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > max2 && max != arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println("Max2 number is " + max2);
    }
}
