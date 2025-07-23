// public class sub {
    
// }

import java.io.*;
import java.util.*;

public class sub {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
        // Write code here 
       Map <Integer , Integer > map  = new HashMap<>();
       int ans = 0 ; 
       int prefix = 0 ; 
       map.put(0, 1);
       for(int i = 0 ; i<n ;i++){
               prefix +=arr[i];
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}