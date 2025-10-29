
import java.io.*;
// import java.util.*;
import java.util.ArrayList;

public class hardmaze {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        ArrayList<String> ans = new ArrayList<>();
        helper(sr, sc, dr, dc, ans, psf);
        // System.out.println(ans);
        for (String s : ans) {
            System.out.println(s);
        }

    }

    public static void helper(int sr, int sc, int dr, int dc, ArrayList<String> ans, String ps) {

        if (sr > dr || sc > dc)
            return;
        if (sr == dr && sc == dc) {

            ans.add(ps);
        }
       for(int steps  =1; steps<= dr ; steps++){
        helper(sr, sc+steps, dr, dc, ans, ps+'h'+steps);
       }



       for(int steps = 1 ; steps<= dc; steps++){
        helper(sr+steps, sc, dr, dc, ans, ps+'v'+steps);
       }


       for(int steps = 1 ; steps<=Math.min(dc, dr) ; steps++){
        helper(sr+steps, sc+steps, dr, dc, ans, ps+'d'+steps);
       }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}