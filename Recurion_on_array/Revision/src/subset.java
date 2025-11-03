import java.io.*;
import java.util.*;

class Solution {
    static int[][] solve(int n, int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(nums, n, 0, curr, ans);
        int k = ans.size();
        int m = ans.get(0).size();
        int[][] result = new int[k][m];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = ans.get(i).get(j);
            }
        }

        return result;

    }

    private static void helper(int[] arr, int n, int idx, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> ans) {
               
        
         
             
             
 




    }
}

public class subset {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr_nums = br.readLine().split(" ");
        int[] nums = new int[n];
        for (int i_nums = 0; i_nums < arr_nums.length; i_nums++) {
            nums[i_nums] = Integer.parseInt(arr_nums[i_nums]);
        }

        int[][] out_ = Solution.solve(n, nums);
        for (int i_out_ = 0; i_out_ < out_.length; i_out_++) {
            System.out.print(out_[i_out_][0]);
            for (int j_out_ = 1; j_out_ < out_[i_out_].length; j_out_++) {
                System.out.print(" " + out_[i_out_][j_out_]);
            }
            System.out.println("");
        }

        wr.close();
        br.close();
    }

}