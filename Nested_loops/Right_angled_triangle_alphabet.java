package Nested_loops;

import java.util.Scanner;

public class Right_angled_triangle_alphabet {
    static void alphabet(int n){
        int a = 65;
        for(int i = 0 ; i < n ; i++){// for row using to manuplating 
            for(int j = 0; j<=i ;j++){
               // logic for alphabet  right angled triangle
               char c = (char) a;
               System.out.print(c+ " ");
               a++;






            }
            System.out.println();

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_for_alphbet_printing = sc.nextInt();
        alphabet(number_for_alphbet_printing);
        sc.close();
    }
}
