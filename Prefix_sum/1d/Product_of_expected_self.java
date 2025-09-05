import java.util.*;

// import java.lang.*;
// import java.io.*;
public class Product_of_expected_self {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        sc.close();
        ;
        long ans[] = obj.ProductOfArrayExceptSelf(n, nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    public long[] ProductOfArrayExceptSelf(int n, int[] a) {
        long[] left = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                left[i] = 1;
            else
                left[i] = left[i - 1] * a[i];
        }

        long[] right = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1)
                right[i] = 1;
            else
                right[i] = right[i + 1] * a[i];
        }

        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                ans[i] = right[i];
            else ans[i] = left[i]*right[i];
        }

        return ans ;
    }
}