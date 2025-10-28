
import java.util.*;

class Solution {
    public int maxPairs(int[] boys, int[] girls) {
        int n = boys.length;
        int m = girls.length;
        int k = Math.min(n, m);
        int count = 0;

        for (int i = 0; i < k; i++) {
            for (int j =i+1; j < k; j++) {
                if ((boys[i] - girls[i]) <= 1) {
                    count++;
                }
            }
        }

        return count;
    }
}

public class Ballroom_Dance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxPairs(a, b));
        sc.close();
    }
}