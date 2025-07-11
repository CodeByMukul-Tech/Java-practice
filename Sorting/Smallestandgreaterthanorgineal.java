
import java.util.*;

public class Smallestandgreaterthanorgineal {

    public static int[] bubble_Sort(int[] arr) {

        int n = arr.length;

        // Step 1: Create a copy of the original array
        int[] sorteds = new int[n];
        for (int i = 0; i < n; i++) {
            sorteds[i] = arr[i];
        }

        // Step 2: Perform Bubble Sort on the copied array
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (sorteds[j] > sorteds[j + 1]) {
                    int temp = sorteds[j];
                    sorteds[j] = sorteds[j + 1];
                    sorteds[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        return sorteds;

    }

    public static int[] SmallestGreaterElements(int[] arr) {
        int n = arr.length;
        int[] sorted = bubble_Sort(arr);
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (sorted[j] > current) {
                    result[i] = sorted[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[i] = -10000000;
            }

        }

        return result;

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for (int a : ans) {
            System.out.print(a + " ");
        }
        sc.close();
    }
}
