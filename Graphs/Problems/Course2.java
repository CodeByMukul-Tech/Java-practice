import java.util.*;

class Solution {

    @SuppressWarnings("unchecked")

    public int[] canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjcent = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjcent.add(new ArrayList<>());
        }
        int Indeger[] = new int[n];
        for(int []edges : prerequisites){
            int u = edges[0];
            int v = edges[1];
            adjcent.get(u).add(v);

        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer>  q=  new ArrayDeque<>();
        for(int i = 0 ; i< n ;i++){
            if(Indeger[i]==0) q.add(i);
        }
        while (!q.isEmpty()) {
            // int size = q.size();
            int node = q.poll();
            ans.add(node);
            for(int nbr : adjcent.get(node)){
                Indeger[nbr]--;
                if(Indeger[nbr]==0)q.add(nbr);
            }
if(ans.)
            get()
        }
    }
}

public class Course2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                prerequisites[i][j] = sc.nextInt();
        }

        Solution Obj = new Solution();
        int[] ans = Obj.canFinish(N, prerequisites);
        if (ans.length == 0)
            System.out.println(-1);
        else {
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println("");
        }

    }
}