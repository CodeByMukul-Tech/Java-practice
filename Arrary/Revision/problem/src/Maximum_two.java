// import java.io.*;
import java.util.*;

public class Maximum_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        ArrayProblem(arr);
        sc.close();
    }

    public static void ArrayProblem(int[] arr) {
       int mx = arr[0];
       int min = arr[0];
       for(int i = 0 ; i<arr.length;i++){
           if(arr[i]>mx){
               mx=arr[i];
           }if(arr[i]<min){
               min=arr[i];
           }
       }
       int ans = Math.abs(mx-min);
        System.out.println(ans);
    }
}
