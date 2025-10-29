
// import java.io.*;
import java.util.*;

public class getmazepattern {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
        input.close();
    }

    public static void helper(int sr, int sc, int dr, int dc, ArrayList<String> ans, String suv) {
        if (sr > dr || sc > dc)
            return;
        if (sr == dr && sc == dc) {
            ans.add(suv);
            return;

        }

        // horizontal
        helper(sr, sc + 1, dr, dc, ans, suv+"h");
        // vertical
        helper(sr + 1, sc, dr, dc, ans, suv+"v");
        //
        // digonal
        // helper(sr+1, sc+1, dr, dc, ans, suv+"d");
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        ArrayList<String> ans = new ArrayList<>();
        helper(sr, sc, dr, dc, ans, "");

        return ans;
    }
}
