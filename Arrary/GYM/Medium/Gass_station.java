import java.util.*;

class Solution {

    public int filling(int A[], int B[], int n) {
        int fuel = 0;
        for (int i = 0; i < n; i++) {
            fuel = fuel + A[i];
            if (fuel < B[i]) {
                return -1;
            }
            fuel = fuel - B[i];

        }
          return fuel;
    }
}

public class Gass_station {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.filling(a, b, n));
    }
}
