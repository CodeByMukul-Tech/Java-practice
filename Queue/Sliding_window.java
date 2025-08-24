import java.util.*;

class Solution {
    static int[] SlidingWindowMaximum(int n, int k, int[] arr) {
        // write code here
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int Right = 0;
        for (; Right < n; Right++) {
            if (arr[Right] > 0) {
                dq.offer(Right);
            }

            if (Right - left + 1 == k) {
                if (!dq.isEmpty()) {
                    ans.add(arr[dq.poll()]);
                }
                if (!dq.isEmpty() && dq.peekFirst() == left) {
                   dq.removeFirst();
                }
                left++;
            }

        }
        int[] ans1 = new int[ans.size()];
       for(int i = 0 ; i< ans.size();i++){
        ans1[i] = ans.get(i);
       }

       return ans1;

    }
}

public class Sliding_window {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        @SuppressWarnings("static-access")
        int[] ans = obj.SlidingWindowMaximum(n, k, nums);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}
