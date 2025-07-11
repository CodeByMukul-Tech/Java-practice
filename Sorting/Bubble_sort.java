import java.util.Scanner;

public class Bubble_sort {




    public static int[] bubble_Sort(int[] arr) {
    int n = arr.length;
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

    System.out.println("Swap count: " + count);
    return arr;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an aray : ");
        int k = sc.nextInt() ;
        int[] a = new int[k];
        System.out.println("Enter the elements ");
        for(int i = 0 ; i< k;i++){
          a[i] = sc.nextInt();
        }
        System.out.println("This is a bubble_sorting algorithm : ");
        int[] e =  bubble_Sort(a);
        for(int i = 0 ; i<e.length;i++){
            System.out.print(e[i]+" ");
        }
        sc.close();
    }
}