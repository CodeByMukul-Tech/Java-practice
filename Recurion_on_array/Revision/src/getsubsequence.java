
// import java.io.*;
import java.util.*;

public class getsubsequence {
    public static ArrayList<String> generateSubsequences(String str) {
        ArrayList<String> ans = new ArrayList<>();
        helper(str, ans, "", 0);
        Collections.sort(ans);
        return ans;

    }

    public static void helper(String str, ArrayList<String> ans, String suv, int idx) {

        if (idx >= str.length()) {
            if (suv != "") {
                ans.add(suv);

            }
            return;
        }

        helper(str , ans, suv, idx+1);
        helper(str, ans, suv+str.charAt(idx), idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        sc.close();
    }
}