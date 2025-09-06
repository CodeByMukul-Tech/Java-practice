import java.util.*;

class Solution {
    public int MaxSum(int[] arr, int n) {
        int sum = 0;
        int total = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0)
                sum = 0;

            total += arr[i];

        }
        int minkadanes = Integer.MAX_VALUE;
        int sums = 0;
        for (int i = 0; i < n; i++) {
            sums += arr[i];
            ans = Math.min(minkadanes, sums);
            if(sums>0) sum = 0 ; 


        }
        return Math.max(sum,total-minkadanes);

    }
}

public class circular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int ans = Obj.MaxSum(arr, n);
        System.out.println(ans);
    }
}