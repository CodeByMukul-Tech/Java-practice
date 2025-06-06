import java.util.*;

public class ArrayProblem2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans=ArrayProblem(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem(int n, int[] arr){
     int max =arr[0];
     int index = 0 ;
        if(n==1){
            return arr[0];
        }
     for(int i = 1 ; i<n ;i++){
        if(arr[i]>max){
            max= arr[i];
            index = i;
        }
     }
       return index;
    }
}