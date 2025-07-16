import java.util.*;

class Solution {
    static int count1(int size, int arr[]) {
         int counts = 0;
         int s =0 ; 
         int e =size-1;
         while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==0){
                counts++;
            }
            if(arr[mid]>0){
                s=mid+1;
            }
            else e = mid-1;
         }
         return size-counts;
    }

}

public class Count1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.count1(n, array));
    }
}
