
import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
        }

        if(start >= nums.length || target <0){
            return;
        }
        current.add(nums[start]);
        backtrack(nums, target-nums[start], start, current, result);
        current.remove(current.size()-1);
        backtrack(nums, target, start+1, current, result);
    }
}

public class combination_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        List<List<Integer>> ans = ob.combinationSum(nums, target);
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