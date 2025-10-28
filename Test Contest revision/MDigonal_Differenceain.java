
// import java.io.*;
import java.util.*;

public class MDigonal_Differenceain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        diagonalDifference(mat, n);
        System.out.println('\n');
        sc.close();
    }

public static void diagonalDifference(int[][] mat, int n) {
    int primary = 0;
    int secondary = 0;

    for (int i = 0; i < n; i++) {
        primary += mat[i][i];            // Primary diagonal (i,i)
        secondary += mat[i][n - 1 - i];  // Secondary diagonal (i, n-1-i)
    }

    System.out.println(Math.abs(primary - secondary));
}

}
