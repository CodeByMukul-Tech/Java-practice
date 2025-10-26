import java.util.*;

public class Row_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr, n, m));
        sc.close();
    }
}

class Solution {
   public  int rowWithMaximumOnes(int arr[][], int n, int m) {
        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {
            int countOnes = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    countOnes++;
                }
            }

            if (countOnes > maxCount) {
                maxCount = countOnes;
                rowIndex = i;
            }
        }

        return rowIndex;
    }
}
