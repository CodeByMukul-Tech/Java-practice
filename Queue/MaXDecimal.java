import java.util.ArrayList;
import java.util.Scanner;
// import java.util.Vector;

class Solution {
    public static void findMaxAverage(int n, int[] nums, int k) {

        ArrayList<Integer> raw = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + k; j++) {
                sum = sum + nums[j];
                raw.add(sum);

            }
        }

        for(int x : raw){
            System.out.print(x+" ");
        }
    }
}

public class MaXDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Solution.findMaxAverage(n, arr, k);
    }
}
