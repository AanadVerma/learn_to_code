package array_and_matrix;

public class PracticeProgramming {
    public static void main(String[] args) {
        int result = 0;
        int[] arr = {2, 4, 6, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("index " + i + " - " + " value " + arr[i] + " ");
            result = result + arr[i];
        }

        System.out.print("result- " + result);
    }
}
