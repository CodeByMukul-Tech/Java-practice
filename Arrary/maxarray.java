import java.io.*;
import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = maxElement(nums);
        System.out.print(result);
    }

    public static int maxElement(int[] arr) {
        int n = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            n = Math.max(ans, arr[i]);

        }
        return n;

    }
}