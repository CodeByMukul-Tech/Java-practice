import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) {
        Map<Character, Integer> ans = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            ans.put(s.charAt(i), ans.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(Character c : ans.values()){
            if( c == 2){
                
            }
        }
          

        

    }
}

public class Non_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);
        System.out.println();
    }
}