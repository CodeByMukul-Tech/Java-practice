import java.io.*;
import java.util.*;

class Solution {
    public long Pairs(int []arr,int k){
      long count =0;
      for(int i = 0 ; i<arr.length;i++){
        for(int j = i+1 ; j<arr.length;j++){
            if((arr[i]+arr[j])%k==0){
                count++;
            }
        }
      }
      return count;
    }
}

public class Pairs_of_sum_divisible_by_equals_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}