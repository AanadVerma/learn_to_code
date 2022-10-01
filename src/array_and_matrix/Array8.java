package array_and_matrix;

public class Array8 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 5, 4, 4, 4, 4};
        int[] arr1 = new int[10];
        System.out.print("Array value is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            arr1[i] = arr[i];
        }

        System.out.print("Array copied value is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
