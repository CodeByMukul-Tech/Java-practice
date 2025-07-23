// public class  {
    // 
// }

import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
		// write code here
        Map<String, Integer> map = new HashMap<>();
        Map<String , Integer> window = new HashMap<>();
        int start = 0 ; 
        int end = 0 ; 
        


    }
}

public class window_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}