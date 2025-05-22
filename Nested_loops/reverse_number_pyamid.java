package Nested_loops;

import java.util.Scanner;

public class reverse_number_pyamid {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for(int i = 1 ; i <= n ; i++){
        for(int j = n ;j>=n-i+1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   } 
}
