import java.util.*;

public class Concept {
    public static int findIndex(int key, int[] arr) {
        int start = 0 ; 
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + ( end -start) / 2;
            if(arr[mid]== key) return mid;
            if(arr[mid]>key) end = mid-1;
            else start =mid+1;
            
        }


        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findIndex(key, arr));
        sc.close();
    }
}