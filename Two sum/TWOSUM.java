import java.util.*;
import java.lang.*;
import java.io.*;

class TWo_sum {
    
    public static int[] twoSum(int[] A, int target) {
       // Your code here
       
        // int[] ans = new int[2];
        int n = A.length;
        int s = 0 ; 
       int e = n-1;
        while (s<e) {
            int sum = A[s]+A[e];
            if(sum<target) s++;
            else if(sum > target )e--;
            else return new int[]{s+1,e+1};
            
        }


        return new int[]{-1,-1};
    }
	
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
	}
}



