

import java.util.*;

class Solution {
   public int goodPairs(int arr[], int n)
    {
        int count = 0 ;
       for(int i = 0 ; i < n ; i++){
        for (int j = i+1 ; j < n ;j++){
            if((arr[i]==arr[j])&& i<j){
                     count++;
            }
        }
       }
       return count;
    }

}

public class Number_of_good_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.goodPairs(array,n));
        sc.close();
    }
}