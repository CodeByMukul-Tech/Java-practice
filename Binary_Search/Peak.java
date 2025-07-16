// import java.io.*;
import java.util.*;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        


        return -1 ;

    }
}

public class Peak {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            n = sc.nextInt();
            int arr1[] = new int[n];
            for(int i=0;i<n;i++)
                arr1[i] = sc.nextInt();
            Solution Obj = new Solution();
            int result = Obj.peakIndexInMountainArray(arr1);
            System.out.print(result + " ");
        }
        System.out.println('\n');
    }
}