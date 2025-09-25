// import java.io.*;
import java.util.*;

class Count_pairs {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        int x = input.nextInt();
        Solution obj = new Solution();
        input.close();
        System.out.println(obj.countElements(arr1, arr2, m, n, x));
    }
}

class Solution {

    public int countElements(int[] arr1, int[] arr2, int m, int n, int x) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] + arr2[j] == x)
                    count++;
            }
        }

        return count;

    }
}