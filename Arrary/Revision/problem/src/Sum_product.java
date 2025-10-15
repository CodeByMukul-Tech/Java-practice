import java.util.*;
import java.io.*;
//import java.lang.*;

class Sum_product

{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            Solution ob = new Solution();
            long ans[] = ob.sumAndProduct(arr, n); 
            System.out.println(ans[0] + " " + ans[1]);           
        }
    }
}


class Solution{
     static long[] sumAndProduct(long arr[], long n){
        long[] ans = new long[2];
        int idx = 0;
    
        for(long i = 0 ; i< n;i++ ){


        }
    }
}