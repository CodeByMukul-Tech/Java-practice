
import java.util.Scanner;

public class Consecutive_pairs{

    public static void pairs(int arr[] , int k ,int n){
        
        int count = 0 ;
        // int num = arr[0];
        for(int i = 0 ; i < arr.length-1 ;i++){
            if(arr[i] + arr[i+1] == k){
                count++;
            }
        }
      System.out.println("pairs is : "+count);



    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i< n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        pairs(arr, k, n);
    }
}