import java.util.*;

class Solution{
    static int[] SlidingWindowMaximum(int N, int K, int[] arr){
       int[] ans
    } 
}

public class SlidingWindowMaximums {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
 