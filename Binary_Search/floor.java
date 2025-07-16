import java.util.*;
// import java.io.*;

public class floor {


    static void floors(int[] a , int n , int target){
             int s = 0 ; 
             int e = n-1;
             while (s<=e) {
                int mid = s+(e-s)/2;
                if(a[mid]== target) System.out.println(mid);
                // if(a[mid])             
                if(a[mid]>target) e=mid-1;
                else s= mid+1;

             }
             System.out.println(-1);
    }
    public static void main(String args[]) {
       @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int target =  sc.nextInt();
       int[] a =new int[n];
       for(int i = 0 ; i< n ;i++){
        a[i] = sc.nextInt();
       }
       floors(a,n,target);
    }
}