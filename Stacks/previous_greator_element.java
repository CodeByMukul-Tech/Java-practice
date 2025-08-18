import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static long[] prevGreater(long[] arr, int n) {
        long[] ans = new long[n];
        // ans[0] = -1;
        Stack<Integer> helper = new Stack<>();
        for (int i = 0; i <n; i++) {
            while (!helper.isEmpty() && arr[helper.peek()] > arr[i]) {
                    // ans[helper.peek()] = arr[i];
                    helper.pop();
            }

             if(!helper.isEmpty()){
            ans[i] = -1;
             }
             else{
                 ans[i] = arr[helper.peek()];
             }
            helper.push(i);
        }

        
        return ans;

    }
}

class prevGreaterelements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = Long.parseLong(inputLine[i]);
        long[] res = new Solution().prevGreater(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}