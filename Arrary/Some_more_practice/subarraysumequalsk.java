
import java.io.*;
// import java.util.*;

class Solution {
    static int solve(int n, int[] arr, int k) {
        // Write your code here
        int count = 0;
        int idx = 0 ; 
        for(int i = 1 ; i<n;i++ ){
            if(arr[i]==k){
                count++;
            }
            if(arr[idx]+arr[i]==k){
                count++;
            }
            idx++;
        }
        return count;
    }
}

public class subarraysumequalsk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_Arr = br.readLine().split(" ");
        int[] Arr = new int[N];
        for (int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++) {
            Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
        }
        int K = Integer.parseInt(br.readLine().trim());

        int out_ = Solution.solve(N, Arr, K);
        System.out.println(out_);

        wr.close();
        br.close();
    }
}