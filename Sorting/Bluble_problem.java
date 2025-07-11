import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Bluble_problem {
    static void bubbleSort(int arr[], int n)
    {
    
    
    int count = 0;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                count++;
                swapped = true;
            }
        }

        // If no two elements were swapped in inner loop, array is sorted
        if (!swapped)
            break;
    }
    System.out.println(count);
    System.out.println(arr[0]);
    System.out.println(arr[n-1]);
  
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
       bubbleSort(arr1, n);
    }
}
