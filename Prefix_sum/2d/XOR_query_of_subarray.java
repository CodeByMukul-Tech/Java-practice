import java.util.*;

public class XOR_query_of_subarray {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        Solution Obj = new Solution();
        int[] result = Obj.xorQueries(arr, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Solution {

    public int[] xorQueries(int[] arr, int[][] q) {
        int n = arr.length;
        int m = q.length;
        int[] prefixxor = new int[n];
        for(int i = 0 ; i< n ;i++){
            if(i==0)prefixxor[i] = arr[i];
            else prefixxor[i] = prefixxor[i-1] ^ arr[i];
        }

        int[] ans = new int[m];
        for(int i= 0 ;i<m;i++ ){
            int l = q[i][0];
            int r = q[i][1];

            if(i==0) ans[i] = prefixxor[r];
            else ans[i] = prefixxor[r]^prefixxor[l-1];
        }
       return ans ;
    }
}