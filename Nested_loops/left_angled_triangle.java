package Nested_loops;

import java.util.Scanner;

public class left_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <=n; i++){// for manuplated the lines 
             for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
             for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();

        }
        sc.close();
    }
    
}
