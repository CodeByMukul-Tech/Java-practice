
// import java.io.*;
import java.util.*;

public class getmaze {
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        ArrayList<String> ans = new ArrayList<>();
        helper(1, 1, n, m, ans, "");
        // Collections.sort(ans);
        return ans;
    }

    public static void helper(int i, int j, int n, int m, ArrayList<String> ans, String path) {
        if (i > n || j > m)
            return;
        if (i == n && j == m) {
            ans.add(path);
            return;
        }
        // helper(i, j + 1, n, m, ans, path + "h1");
        // helper(i, j + 2, n, m, ans, path + "h2");
        // helper(i + 1, j, n, m, ans, path + "v1");
        // helper(i + 2, j, n, m, ans, path + "v2");
        // helper(i + 1, j + 1, n, m, ans, path + "d1");
        // helper(i + 2, j + 2, n, m, ans, path + "d2");

        for (int steps = 1; steps <= m - j; steps++) {
            helper(i, j + steps, n, m, ans, path + "h" + steps);
        }

        for (int steps = 1; steps <= n - i; steps++) {
            helper(i + steps, j, n, m, ans, path + "v" + steps);
        }

        for (int steps = 1; steps <= Math.min(m - j, n - i); steps++) {
            helper(i + steps, j + steps, n, m, ans, path + "d" + steps);
        }

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }
        input.close();

    }
}
