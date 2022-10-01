package newPractice;

public class Testing {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        print(3);

    }

    static public void print(int n) {
        if (n > 0) {
            System.out.println(n);
            n = n - 1;
            print(n);
            System.out.println(n);
            print(n);
        }
    }
}


