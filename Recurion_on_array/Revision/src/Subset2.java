import java.util.*;

class Main {

    public static void sort2DArrayList(ArrayList<ArrayList<Integer>> list) {
        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> sublist1, ArrayList<Integer> sublist2) {
                // Compare values up to the minimum of their sizes
                int minLength = Math.min(sublist1.size(), sublist2.size());
                for (int i = 0; i < minLength; i++) {
                    int valueComparison = Integer.compare(sublist1.get(i), sublist2.get(i));
                    if (valueComparison != 0) {
                        return valueComparison;
                    }
                }

                // If values are the same, compare sizes
                return Integer.compare(sublist1.size(), sublist2.size());
            }
        });
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] arr, int n) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(arr, n, ans, 0 , current);
        return ans;
    }

    private static void helper(int[] a, int n,ArrayList<ArrayList<Integer>> ans, int idx, ArrayList<Integer> curr) {
          if(idx ==n){
            ans.add(new ArrayList<>(curr));
            return;

          }

          curr.add(a[idx]);
          helper(a, n, ans, idx+1, curr);

          curr.remove(curr.size()-1);
          helper(a, n, ans, idx+1, curr);

         
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);
            ArrayList<ArrayList<Integer>> res = subsets(A, n);

            sort2DArrayList(res);

            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();

            }
        }
    }
}