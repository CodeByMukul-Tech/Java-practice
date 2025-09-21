package Problems;
import java.util.*;
import java.io.*;
 
class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    @SuppressWarnings("unchecked")
    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];
        
        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }
 
    void addEdge(int v, int w) {
        adjList[v].add(w);
     
    }
 
    void BFS(int x) {
        // your code here
        Queue<Integer> q = new ArrayDeque<>();
        boolean vist[] = new boolean[vertices+1];
        q.add(x);
        vist[x] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+" ");
            ArrayList<Integer> nbr = adjList[node];
            for(int nbrs : nbr){
                if(!vist[nbrs]){
                    vist[nbrs]=true;
                    q.add(nbrs);
                }
            }
            
        }
    }
}
 
public class BFS {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}

