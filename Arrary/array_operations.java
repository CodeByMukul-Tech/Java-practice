import java.util.*;

public class array_operations {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();

        }
        sc.close();

        // Call the array_operation method to use the array
        array_operation(arr, n);

    }

    public static void array_operation(int arr[],int n ){
        // maximum element
        // int index = 0 ;
        int sum = 0;
        int max = arr[0];
        for(int i = 1 ; i < n ;i++){
            if(arr[i] > max){
                max = arr[i];
                // index = i;
            }

        }
        for(int i = 0 ; i< n ;i++){
            sum +=arr[i];
        }
        double average = (double)sum/n;
        System.out.println("Maximum element is: " + max + " at sum: " + sum + " and the average is: " + average);
    }
     
}
