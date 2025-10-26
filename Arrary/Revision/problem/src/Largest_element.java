
import java.util.*;

class Solution {
    public int LargestElement(int[] nums, int n) {
        int idx = 0 , mx = Integer.MIN_VALUE;
        // int nums = arr[0];
        for(int i = 0 ; i<n;i++){
            if(nums[i]>mx){
                mx=nums[i];
                idx=i;
            }
        }
        for(int i = 0 ; i < n ;i++){
            if(idx!=i&&mx<2*nums[i]){
                return -1;
            }
        }
        return idx; // placeholder return
    }
}

public class Largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
        sc.close();
    }
}
