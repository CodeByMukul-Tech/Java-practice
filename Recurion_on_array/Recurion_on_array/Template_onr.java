package Recurion_on_array;

import java.util.Scanner;

// import java.util.*;


public class Template_onr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
         sc.close();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

	public static void PrintArray(int[] arr, int n) {
      print(arr,0,n);
    }
    public static void print(int arr[],int i , int n){
        if(i>=n)return;
        System.out.print(arr[i]+" ");
        print(arr,i+1,n);
    }

}