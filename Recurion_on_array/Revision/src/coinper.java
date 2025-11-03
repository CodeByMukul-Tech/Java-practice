
import java.util.*;

class Solution {
    public  void coinChange2(int[] coins, int amt){
        helper();
    }
}

public class coinper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange2(coins, amt);
        sc.close();
    }
}