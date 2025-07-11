import java.util.*;

public class Maxoccur {
    static int maximum_occurrence(int arr[], int n) {
        int count = 0 ; 
        for(int i = 0 ; i<n;i++){
            for(int j = i+1 ; j<n;j++){
                if(arr[i]==arr[j]){
                   count++;
                    break;
                }
            }
        } 

         return count;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));
        sc.close();

    }
}
