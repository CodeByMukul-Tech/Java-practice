package Nested_loops;

import java.util.Scanner;

public class Diamond_problem {

    static void upper(int n) {
        
    }

    static void lower(int n) {
       
    }

    static void Diamond(int n, int i) {
        for(int a = 0 ; a < i;a++){
            upper(n);
            lower(n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (for half diamond): ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();
        Diamond(n,i);
    }
}
