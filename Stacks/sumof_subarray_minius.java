// import java.io.*;
import java.util.*;

class Solution{
	public long minSubarraySum(int n, int a[]){
		long sum = 0 ; 
        


        return sum ;
	}
}

public class sumof_subarray_minius {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
		Solution Obj = new Solution();
        input.close();
        System.out.println(Obj.minSubarraySum(n,a));
    }
}
