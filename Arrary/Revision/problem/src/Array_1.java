import java.util.*;

public class Array_1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem1(n, arr);
        System.out.println(ans);
    }

    public static int ArrayProblem1(int n, int[] arr) {

        int m = arr[0];
        int idx = 0 ;
        for(int i = 0 ; i< n ;i++){
            if(arr[i]>m){
                m=arr[i];
                idx=i;
            }
        }
        return idx; // placeholder return
    }
}
