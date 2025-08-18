import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    // Approach 1
    // public static long[] nextLargerElement(long[] arr, int n) {
    //     long[] ans = new long[n];
    //     ans[n - 1] = -1;
    //     Stack<Long> helper = new Stack<>();
    //     for (int i = n - 2; i >= 0; i--) {
    //         while (!helper.isEmpty() && helper.peek() < arr[i]) {
    //             helper.pop();

    //         }
    //         if (helper.isEmpty())
    //             ans[i] = helper.peek();
    //         else
    //             ans[i] = -1;

    //         helper.push(arr[i]);
    //     }
    //     return ans;
    // }
//  Approach 2 elements looking for their bigger
     public static long[] nextLargerElement(long[] arr, int n) {
        long[] ans = new long[n];
        Stack<Integer> helper = new Stack<>();
        for(int i = 0 ;i<n;i++){
            while (!helper.isEmpty() && helper.peek()<arr[i]) {
                ans[helper.peek()] = arr[i];
                helper.pop();
                
            }
            helper.push(i);

        }
        while (!helper.isEmpty()) {
            ans[helper.peek()] = -1;
            helper.pop();
            
        }
        return ans;

     }
}

class NExt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = Long.parseLong(inputLine[i]);
        long[] res = new Solution().nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}