import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtracker(1, k, n, result, curr);
        return result;
    }

    private void backtracker(int start, int k, int target, List<List<Integer>> result, List<Integer> curr) {
        if (curr.size() == k && target == 0) {

            result.add(new ArrayList<>(curr));
            return;
        }

        if (curr.size() > k || target < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            curr.add(i);
            backtracker(i + 1, k, target - i, result, curr);
            curr.remove(curr.size() - 1);

        }
    }

}

public class Comsubsum3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        Solution ob = new Solution();
        List<List<Integer>> ans = ob.combinationSum3(k, n);
        for (int i = 0; i < ans.size(); ++i) {
            Collections.sort(ans.get(i));
        }
        Collections.sort(ans, (o1, o2) -> {
            int m = Math.min(o1.size(), o2.size());
            for (int i = 0; i < m; i++) {
                if (o1.get(i) == o2.get(i)) {
                    continue;
                } else {
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();

        }

        sc.close();
    }
}