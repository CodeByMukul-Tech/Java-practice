package GYM.Easy;

import java.util.*;
// import java.io.*;

public class Digonal_matrix {


    public static int frist(int[][] a , int n){
        int mul= 1;
         for(int i = 0 ; i<n;i++){
            mul = mul *a[i][i];
         }
         return mul;
    }
    public static int second(int[][] a, int n){
        int mul = 1; 
        for(int i = 0 ;i<n;i++){
            mul= mul * a[i][n-1-i];
        }
        return mul;
    }
    public static void digonals(int[][] a , int n){
            int b = frist(a, n);
            int c = second(a, n);
            System.out.println(b*c);
    }
    public static void main(String args[]) {

        Scanner iron = new Scanner(System.in);
        int n = iron.nextInt();
        int[][] s = new int[n][n];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ; j<n ;j++){
                s[i][j] = iron.nextInt();
            }
        }

        digonals(s, n);
        iron.close();

       
    }
}