import java.util.*;

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int matrix[][], Pair query[]) {
        // Your code here
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixsum = new int[n][m];

        for(int i = 0 ; i< n ;i++){
            for(int j = 0 ; j<m ;j++){
                if(i==0&&j==0) prefixsum[i][j] = matrix[i][j];
                else if(i==0) prefixsum[i][j]= prefixsum[i][j-1]+matrix[i][j];
                else if(j==0) prefixsum[i][j] = prefixsum[i-1][j]+matrix[i][j];
                else prefixsum[i][j] = prefixsum[i][j-1]+prefixsum[i-1][j]-prefixsum[i-1][j-1]+matrix[i][j];
            }
        }
        int k = query.length;
        for(int i = 0 ;i<k;i++){
            int r1 =query[i].row1; 
            int c1=query[i].col1;
            int r2=query[i].row2;
            int c2=query[i].col2;


            int sum = prefixsum[r2][c2];
            if(r1-1>=0) sum-=prefixsum[r1-1][c2];
            if(c1-1>=0) sum-=prefixsum[r2][c1-1];
            if(r1-1>=0&&c1-1>=0) sum+=prefixsum[r1-1][c1-1];

            ans.add(sum);
        }



        return ans;
    }
}

class Range_sum_2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p = new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i] = p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for (int x : ans)
            System.out.println(x);
        sc.close();
    }
}
