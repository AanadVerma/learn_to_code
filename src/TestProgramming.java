public class TestProgramming {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 6};
        int missing = getMissingNo(a, a.length);
        System.out.println(missing);

    }

    private static int getMissingNo(int[] a, int b) {
        int total, i;
        total = (b + 1) * (b + 2) / 2;
        for (i = 0; i < b; i++) {
            total -= a[i];

        }
        return total;
    }
}