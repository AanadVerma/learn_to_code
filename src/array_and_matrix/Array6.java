package array_and_matrix;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 5, 4, 4, 4, 4};
        int countEven = 0;
        int countOdd = 0;
        System.out.print("Array value is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                countEven++;

            } else {
                countOdd++;
            }
        }
        System.out.println("even value is: " + countEven);
        System.out.println("odd value is: " + countOdd);
    }
}
