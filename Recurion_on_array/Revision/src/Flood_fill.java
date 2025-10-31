
import java.util.*;

public class Flood_fill {
    public static void FloodFill(int[][] w, int x, int y, int c) {
        int n = w.length;
        int m = w[0].length;
        if (w[x][y] == c)
            return;
        helper(w, x, y, c, n, m, w[x][y]);

    }

    public static void helper(int[][] w, int i, int j, int z, int n, int m, int orginal_clor) {

        if (i < 0 || j < 0 || i >= n && j >= m)
            return;
        // return;
        if (w[i][j] != orginal_clor) {
            return;
        }

        w[i][j] = z;
        helper(w, i - 1, j, z, n, m, orginal_clor);
        helper(w, i, j - 1, z, n, m, orginal_clor);
        helper(w, i, j + 1, z, n, m, orginal_clor);
        helper(w, i + 1, j, z, n, m, orginal_clor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] w = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; ++j)
                w[i][j] = sc.nextInt();
        }
        int x = sc.nextInt(), y = sc.nextInt(), c = sc.nextInt();
        FloodFill(w, x, y, c);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(w[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}