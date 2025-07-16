// import java.io.*;
import java.util.*;

class Solution {
    // @SuppressWarnings("unlikely-arg-type")
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
        Map<Integer, Integer> fre = new HashMap<>();

       for(int i = 0 ;i<n;i++){
        int value = fre.getOrDefault(nums[i], 0);
        fre.put(nums[i], value+1);
        if(fre.get(nums[i])==k){
            System.out.println(nums[i]);
            return ;
        }

 

       }
       System.out.println(-1);
        
    }
}

public class fre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
    }
}