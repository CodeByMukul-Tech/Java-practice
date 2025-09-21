import java.io.*;
import java.util.*;

class Candies {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
        int n=sc.nextInt(); 
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            arr.add(x);
        }
        
        Solution ob=new Solution();
        System.out.println(ob.candies(arr,n));
        
	}
}


class Solution {
    public int candies(ArrayList<Integer> A,int n) {
       int[] candies_distribute = new int[n];
       int[] candies_right = new int[n];
       int[] candies_left = new int[n];
       for(int i = 0 ; i< A.size();i++){
        candies_distribute[i] = 1;
       }
       
       
       for(int i = 0 ; i< n ;i++){

       }


	
    }
}
