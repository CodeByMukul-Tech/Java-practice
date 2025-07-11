import java.util.Scanner;

public class Selection_sort {
 

   public static int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minindex]) {
                    minindex = j;
                }
            }
            // Swap only if needed
            int temp = a[i];
            a[i] = a[minindex];
            a[minindex] = temp;
        }
        return a;
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
        int[] e =  selectionSort(a);
        for(int i = 0 ; i<e.length;i++){
            System.out.print(e[i]+" ");
        }
        sc.close();
    }
    }

