import java.util.*;

class Solution {
    public void printElementsAlternately(int[][] mat,int m,int n) {
        boolean left =  true ;
        for(int i = 0 ;i<m ;i++){
            if(left){
                for(int j = 0 ; j < n;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }

            left = !left;

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat,m,n);
       
        sc.close();
    }
}

