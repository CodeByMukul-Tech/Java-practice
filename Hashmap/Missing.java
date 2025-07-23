import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {

        // frist map for checking
        Map<Integer, Integer> num1 = new HashMap<>();
        Map<Integer, Integer> num2 = new HashMap<>();

        // put values if contain only add the value of key

        for (int i = 0; i < n; i++) {
            num1.put(arr[i], num1.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            num2.put(brr[i], num2.getOrDefault(brr[i], 0) + 1);
        }
        // chhecker key is present or same frequesncy 
        List<Integer> ans = new ArrayList<>();
        for (int key : num2.keySet()) {
            if (!num1.containsKey(key))
                ans.add(key);
            else if (num1.get(key) != num2.get(key))
                ans.add(key);
        }

        // then sort it 

        Collections.sort(ans);
        // print it 
        if (ans.isEmpty()) {
            System.out.println("-1");  // <-- Add this to handle the case where nothing is missing
        } else {
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }

        }

    }

}

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n, arr, m, brr);
    }
}