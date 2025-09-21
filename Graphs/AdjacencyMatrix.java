public class AdjacencyMatrix {

    static void addEdge(int [][]adjMatrix, int i, int j, boolean isBidir) {
        adjMatrix[i][j] = 1;
        if(isBidir) {
            adjMatrix[j][i] = 1;
        }
    }

    public static void main(String[] args) {
        int V = 7;

        int [][] adjMatrix = new int[V+1][V+1];

        addEdge(adjMatrix,0,2,true);
        addEdge(adjMatrix,0,6,true);
        addEdge(adjMatrix,0,7,true);
        addEdge(adjMatrix,1,2,true);
        addEdge(adjMatrix,2,4,true);
        addEdge(adjMatrix,2,3,true);
        addEdge(adjMatrix,3,5,true);
//        addEdge(adjMatrix,2,3,true);

        for(int i=0;i<=V;i++) {
            System.out.print(i + "->");
            for(int j=0;j<=V;j++) {
                if(adjMatrix[i][j]==1) System.out.print(j + ",");
            }
            System.out.println();
        }
    }
}