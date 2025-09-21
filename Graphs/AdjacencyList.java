import java.util.ArrayList;

public class AdjacencyList {
    public static void addList(ArrayList<ArrayList<Integer>> al, int i, int j, boolean e) {
        al.get(i).add(j);
        if (e) {
            al.get(j).add(i);
        }
    }

    public static void main(String[] args) {
        int v = 6; // vertex count (1-based indexing ke liye ek extra liya)
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        // Har vertex ke liye ek empty list banani zaroori hai
        for (int i = 0; i < v; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Edges add karo (sirf ek baar hi)
        addList(adjacencyList, 1, 2, true);
        addList(adjacencyList, 2, 3, true);
        addList(adjacencyList, 3, 4, true);
        addList(adjacencyList, 1, 5, true);

        // Print adjacency list
        for (int i = 1; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j : adjacencyList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
