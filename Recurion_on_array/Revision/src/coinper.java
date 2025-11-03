
import java.util.*;

class Solution {
    public void coinChange2(int[] coins, int amt) {
        Arrays.sort(coins);
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(coins, amt, curr);

    }

    private void helper(int[] coins, int target, ArrayList<Integer> curr) {
        if (target == 0) {
            for(int i = 0 ; i< curr.size();i++){
                System.out.print(curr.get(i));
            }
            System.out.println();
            return;

        }
        if (target < 0) {
              return;
        }
        for (int coinss : coins) {
            curr.add(coinss);
            helper(coins, target - coinss, curr);
            curr.remove(curr.size() - 1);
        }

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