// import java.io.*;
import java.util.*;

class Solution {
    public int longestUniqueSubsttr(String str) {
          int ans = 0 ; 
          int left = 0 ;
          int right = 0 ; 
          int n = str.length();
          boolean[]isvisited = new boolean[26];
          for(int i = 0 ; i< n ;i++){
            char c = str.charAt(i);
            while (left < right && isvisited[c-'a']) {
                isvisited[str.charAt(left) - 'a'] = false;
                left++;
                
            }
            isvisited[c-'a'] = true;
            ans = Math.max(ans, left-right+1);
            right++;

          }
          return ans;
    }
}

public class long_distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}
 