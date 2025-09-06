import java.util.*;

class Solution {


    static int getdistinctchars(String str){
        boolean[] isvisited = new boolean[26];
        int n = str.length();
        int unique= 0 ; 

        for(int i = 0 ; i<n;i++){
            char c = str.charAt(i);
            if(isvisited[c - 'a']){
                isvisited[c - 'a'] = true;
                unique++;


            }
        }
        return unique;
    }
    public int longestSubstring(String s, int k) {
          int total_distinct = getdistinctchars(s);
          int ans = 0;
          for(int unique =1 ; unique<total_distinct;unique++){
            int curruniq  = 0;
            if(curruniq<= unique){
              
            }
            else {
            
            } 

          }






       return ans;
    }
}

public class ubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        Solution Obj =  new Solution();
        System.out.println(Obj.longestSubstring(str,k));
    }
}
