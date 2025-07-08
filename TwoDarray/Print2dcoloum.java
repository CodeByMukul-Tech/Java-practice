import java.util.Scanner;

public class Print2dcoloum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Rows
            int m = sc.nextInt();  // Columns
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();

            Solution obj = new Solution();
            obj.printMatrixColumnwise(matrix, n, m);
        }

        sc.close();
    }
}

class Solution {
    public void printMatrixColumnwise(int[][] mat, int n, int m) {
        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                sb.append(mat[row][col]).append(" ");
            }
        }
        System.out.println(sb.toString().trim()); // Print in a single line
    }
}
