package Recurion_on_array;

import java.util.Scanner;

// import java.util.*;


public class template_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }
    // Reverse using of 

	public static void PrintArray(int[] arr, int n) {
      print(arr,n);
    }
    public static void print(int arr[], int n){
        if(n==0)return;
        System.out.println(arr[n-1]);
        print(arr,n-1);

    }

}