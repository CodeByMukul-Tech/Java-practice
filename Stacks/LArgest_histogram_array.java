
// Home work 
import java.util.*;
import java.lang.*;
import java.io.*;

class LArgest_histogram_array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++)
            arr[i] = Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
    }
}

class Solution {

    public static long[] getrigth(long hist[]) {
        int n = hist.length;
        Stack<Integer> st = new Stack<>();
        long[] ans = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && hist[i] < hist[st.peek()]) {
                ans[st.peek()] = i;
                st.pop();

            }
            st.push(i);

        }

        while (!st.isEmpty()) {
            ans[st.peek()] = -1;
            st.pop();

        }

        return ans;

    }

    public static long[] getleft(long hist[]){
         int n = hist.length;
        Stack<Integer> st = new Stack<>() ;
        long[] ans = new long[n];
        for(int i = 0 ; i<n ;i++){
              while (!st.isEmpty() && hist[i]<hist[st.peek()]) {
                ans[st.peek()] = i;
                st.pop();
                
              }
              st.push(i);


            }

            while (!st.isEmpty()) {
                ans[st.peek()] =n;
                st.pop();

                
            }

            return ans;

    }

    public static long maximumArea(long hist[], long n) {
        long rigth[] = getrigth(hist);
        long left[] = getleft(hist);
        long ans = -1;
        for (int i = 0; i < n; i++) {
            long length = rigth[i];
            long width = rigth[i] - left[i] - 1;
            ans = Math.max(ans, length * width);

        }
        return ans;

    }
}