// import java.io.*;
// import java.lang.reflect.Array;
import java.util.*;
/* 
 * Approaching use to solve the frist divide the question the left or right left then 
 * go the right side to solve the question .
 * 
 * remember : only the divide question in the solve it ....
 * 
 * 
 * 
 * 
 * 
 * 
*/


class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        Solution ob = new Solution();
        System.out.println(ob.candies(arr, n));
        sc.close();
    }
}

class Solution {
    public int candies(ArrayList<Integer> A, int n) {
        // int[] candies_distribute = new int[n];
        int[] candies_right = new int[n];
        int[] candies_left = new int[n];
        Arrays.fill(candies_left, 1);
        Arrays.fill(candies_right, 1);
        for (int i = 1; i < n; i++) {
            if (A.get(i) > A.get(i - 1)) {
                candies_left[i] = candies_left[i - 1] + 1;
            }
        }

        for(int i = n-2;i>=0;i--){
            if(A.get(i)>A.get(i+1)){
                candies_right[i] = candies_right[i+1]+1;
            }
        }

       int ans = 0 ; 
       for(int i = 0 ;i< n ;i++){
        ans=Math.max(candies_left[i], candies_right[i]);
       }

       return ans;
    }
}
