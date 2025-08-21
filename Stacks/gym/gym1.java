package gym;

import java.io.*;
import java.util.*;

class Solution {
    public int[] prevSmall(int[] row) {
        Stack<Integer> st = new Stack<>();
        int n = row.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && row[st.peek()] > row[i]) {
                st.pop();

            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = row[st.peek()];
            }
            st.push(i);

        }
        return ans;
    }
}

class gym1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        int[] res = obj.prevSmall(arr);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        System.out.println();
        sc.close();
    }
}
