
import java.util.*;

class Solution {
    public  void coinChange(int[] coins, int amt){
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       ArrayList<Integer> result = new ArrayList<>();
       int sum = 0 ;
       helper(coins,amt, ans,sum , 0,result);
       System.out.println(ans);

    }

    private void helper(int[] coins , int target, ArrayList<ArrayList<Integer>> ans , int sum , int start, ArrayList<Integer> result){
        if(target == 0){
            ans.add(new ArrayList<>(result));
            return;
        }
    }

    private ()
}

public class Coin_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange(coins, amt);
    }
}