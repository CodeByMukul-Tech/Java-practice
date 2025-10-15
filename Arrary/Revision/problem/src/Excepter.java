
import java.util.*;

public class Excepter {

    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        int[] output = new int[n];
        int sum = 0 ;
        for(int x :nums) {
            sum += x;
        }
        for(int i = 0 ; i< n ;i++){
            int x = sum;
            sum -=nums[i];
            output[i] = sum;
            sum =x;

        }


        return output; // placeholder return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}
