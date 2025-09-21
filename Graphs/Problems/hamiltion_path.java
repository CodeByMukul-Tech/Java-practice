import java.io.*;
import java.util.*;

class Hamiltion_path {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        Solution ob = new Solution();
        if (ob.check(N, M, Edges)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) {
        ArrayList<ArrayList<Integer>> ajcentList = new ArrayList<>();
        for(int i = 0 ; i<N ; i++){
            ajcentList.add(new ArrayList<>());
        }
        int count = 0 ; 
        for(ArrayList<Integer> edge : Edges){
            int u = edge.get(0);
            int v = edge.get(1);
            ajcentList.get(u).add(v);
            ajcentList.get(v).add(u);


        }
        boolean vis[] = new boolean[N+1];
        for(int i = 1 ; i<=N;i++){
            if(dfs(i , vis , ajcentList, 0)==true) return true;
        }
    return false;
    }

    static boolean dfs(int src ,boolean[] vis , ArrayList<ArrayList<Integer>> adj ,  int cnt , int N){
        if(cnt == N) return true;
        vis[src ] =  true;
        if(!vis[src])
    }
} 