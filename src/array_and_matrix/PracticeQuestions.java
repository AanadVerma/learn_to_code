package array_and_matrix;

public class PracticeQuestions {
    public static void main(String[] args) {

        int[] arr = {7, 6, 4, 13, 12, 5, 7, 1};

        boolean isPresent = pairExist(arr, 9);
        if (isPresent) {
            System.out.print("Pair Exists");
        } else {
            System.out.print("Pair not Exists");
        }


    }

    private static boolean pairExist(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }
}
