import java.util.Scanner;

class Solution {
    static int findLengthOfSmallestSubarray(int[] a, int K) {
        int left = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int n = a.length;
        for (int right = 0; right < n; right++) {

            sum += a[right];
            while (sum>=K) {
                minlen = Math.min(minlen,right-left+1);
                sum-=a[left];
                left++;
                
            }
        }
        return (minlen == K) ? 0:minlen;

    }
}

public class maximum_size {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int K = keyboard.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}