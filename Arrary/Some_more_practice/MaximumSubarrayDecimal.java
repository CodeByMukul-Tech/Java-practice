import java.util.Scanner;
// import java.util.Vector;

class Solution {
    public static void findMaxAverage(int n, int[] nums, int k) {
        int left = 0;
        double[] ans = new double[n - k + 1];
        int idx = 0;
        int right = 0;
        double sum = 0;
        while (right < k) {
            sum += nums[right];
            right++;
            if (right - left == k) {
                double avg = sum / k;
                ans[idx++] = avg;
                System.out.println();
                sum -= nums[left];
                left++;
            }

        }

        double mx = Integer.MIN_VALUE;
        for (int i = 0; i < ans.length; i++) {
            mx = Math.max(mx, ans[i]);
        }
        System.out.printf("%.5f", mx);
    }
}

public class MaximumSubarrayDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        Solution.findMaxAverage(n, arr, k);
    }
}
