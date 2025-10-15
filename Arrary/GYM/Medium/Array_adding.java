
import java.util.*;

public class Array_adding {





    static int[] calSum(int[] a, int[]b, int n, int m) {
       int sizer = Math.max(n,m)+1;
       int carry = 0 ;
       int[] ans = new int[sizer];
       int i = n-1, j=m-1,k=sizer-1;
        while (i >= 0 || j >= 0) {
            int d1 = (i >= 0) ? a[i] : 0;
            int d2 = (j >= 0) ? b[j] : 0;
            int sum = d1 + d2 + carry;
            ans[k--] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            if (k < 0) break;  // Extra safety if k runs out of bounds
        }

        if(carry!=0){
         ans[k] = carry;
         return  ans;
     }
     else{
         return Arrays.copyOfRange(ans, 1, ans.length);
     }

    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}
