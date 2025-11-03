import java.util.*;

public class Target_subset_sum {
    public static ArrayList<ArrayList<Integer>> findSubsets(int[] arr, int tar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(arr,tar,0 , new ArrayList<>() , result);
        return result;
    }

    private static void helper(int[] arr, int target , int idx , ArrayList<Integer> current , ArrayList<ArrayList<Integer>> result){
          
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(idx >= arr.length || target<0) return;

        current.add(arr[idx]);
        helper(arr, target-arr[idx], idx+1, current, result);
        current.remove(current.size()-1);
        helper(arr, target, idx+1, current, result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tar;
        n = sc.nextInt();
        tar = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subsets = findSubsets(arr, tar);
        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        if (subsets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < subsets.size(); i++) {
                for (int j = 0; j < subsets.get(i).size(); j++)
                    System.out.print(subsets.get(i).get(j) + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}