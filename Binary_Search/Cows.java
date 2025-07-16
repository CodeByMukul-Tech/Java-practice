import java.io.*;
import java.util.*;
import java.util.*;

class Solution{

    public static int aggressiveCows(int a[],int cows){
       //Write your code here

       return -1;
    }


}

public class Cows {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));

    }
}

