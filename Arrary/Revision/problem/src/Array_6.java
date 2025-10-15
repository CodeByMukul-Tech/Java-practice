
import java.util.*;

public class Array_6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem6(n, arr);
        System.out.println(ans);
    }

    public static int ArrayProblem6(int n, int[] arr){
     int prev = -1;
     int mx = Integer.MAX_VALUE;
     int counter = 0;
     for(int i = 0 ; i< n;i++){
         if(arr[i]>0&&arr[i]%2==0){
             counter++;
             if(prev!=-1){
                 int distance = prev -i;
                 mx= Math.min(mx,distance);
             }
             prev=i;
         }
     }

     return  counter;

        // placeholder return
    }
}
