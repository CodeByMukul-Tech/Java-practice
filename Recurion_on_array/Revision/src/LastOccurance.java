
import java.util.Scanner;

class LastOccurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int T = s.nextInt();
        System.out.println(lastIndex(A, T, 0));
        s.close();
    }

    static int lastIndex(int A[], int T, int startIndex) {

        return helper(A, T, A.length, startIndex);

    }

    static int helper(int[] a, int target, int n, int i) {
        if (n == i)
            return -1;
        if (a[n - 1] == target)
            return n - 1;
        return helper(a, target, n - 1, i);
    }
}