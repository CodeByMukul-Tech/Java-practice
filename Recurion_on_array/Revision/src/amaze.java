
// import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class amaze {
  public static void aMazePaths(int n, int m, String psf, int i, int j) {
    ArrayList<String> ans = new ArrayList<>();
    helper(i, j, n, m, ans, psf);
    for (String a : ans) {
      System.out.println(a);
    }

  }

  public static void helper(int i, int j, int n, int m, ArrayList<String> ans, String path) {
    if (i > n || j > m)
      return;
    if (i == n && j == m) {
      ans.add(path);
      return;
    }

    for (int steps = i; steps <= n; steps++) {
      helper(i, j + 1, n, m, ans, path + 'h');
    }
    for (int steps = j; steps <= m; steps++) {
      helper(i + 1, j, n, m, ans, path + 'v');
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputLine;
    inputLine = br.readLine().trim().split(" ");
    int n = Integer.parseInt(inputLine[0]);
    inputLine = br.readLine().trim().split(" ");
    int m = Integer.parseInt(inputLine[0]);
    aMazePaths(n, m, "", 1, 1);
  }
}