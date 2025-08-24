
import java.io.*;
import java.util.*;

class Solution {

    public static void solve(String pattern) {
        Stack<Integer> st = new Stack<>();
        // int num = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int n = pattern.length() + 1;
        for (int i = 1; i < n; i++) {
            char c = pattern.charAt(i);
            if (c == 'd') {
                st.push(i);
            }
            if (c == 'i') {
                while (!st.isEmpty() && st.peek() >= 0) {
                    ans.add(st.pop());
                }
            }

        }
    }
}

public class smallest_number {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solution Obj = new Solution();
        Obj.solve(str);
    }
}