package practice;

import java.util.Random;

public class TestProgramme {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        System.out.print("array value is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int j = 0; j < arr.length; j++) {
            int temp = arr[j];
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (temp < arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Maximum number is " + temp);
                break;
            }
        }
    }
}
