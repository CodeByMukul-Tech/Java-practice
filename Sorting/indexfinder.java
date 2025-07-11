import java.util.Scanner;

public class indexfinder {

   
    static int findIndex(int[] arr, int n, int k) {
        boolean swapped ;
        for(int i = 0 ; i<n ;i++){
            swapped = false;
            for(int j = 0 ; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
            break;
        }
        }
        
        int idx = 0 ;
        for(int i = 0 ; i<n;i++){
            if(arr[i]==k){
                idx = i;
            }
        }

            
        return idx ;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input size of array
        int[] arr = new int[n]; // Declare array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Input value of k

        // Call the function findIndex and store the result in index
        int index = findIndex(arr, n, k);

        // Output the result
        System.out.println(index);

        scanner.close(); // Close the scanner
    }
}

