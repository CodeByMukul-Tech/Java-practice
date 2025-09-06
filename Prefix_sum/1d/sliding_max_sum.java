
import java.util.*;

class Solution {

    static int[] SlidingWindowMaximum(int n, int k, int[] arr) {
        int asn = Integer.MIN_VALUE;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n - k + 1; i++) {
                 
            }
        }
    }

}

public class sliding_max_sum {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans = obj.SlidingWindowMaximum(n, k, nums);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}
