package array_and_matrix;

public class PracticeQuestion2 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 13, 12, 5, 7, 1};
        //int i = maxIndes(arr, 5);
        sortedArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int maxIndes(int[] arr, int lenght) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i <= lenght; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static void sortedArray(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            int index = maxIndes(arr, i);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
