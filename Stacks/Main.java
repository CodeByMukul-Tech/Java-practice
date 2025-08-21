import java.util.*;

class Solution {
    public boolean validateStack(int[] pushed, int[] popped) {
     Stack<Integer> st = new Stack<>();
        int n = pushed.length;
        int idx = 0 ;
        for(int i = 0 ; i<n;i++){
              st.push(pushed[i]);
            while (!st.isEmpty()&&st.peek()==popped[idx]) {
                st.pop();
                idx++;
                
            }
            
          

        }

        return idx == popped.length;
      
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        for (int i = 0; i < n; i++) {
            pushed[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            popped[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        System.out.print(Obj.validateStack(pushed, popped));
    }
}