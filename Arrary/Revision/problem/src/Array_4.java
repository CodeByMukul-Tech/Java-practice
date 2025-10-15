import java.io.*;
import java.util.*;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int []arrA = new int[n];
        for(int i = 0; i < n; ++i){
            arrA[i] = sc.nextInt();
        }

        n = sc.nextInt();
        int []arrB = new int[n];
        for(int i = 0; i < n; ++i){
            arrB[i] = sc.nextInt();
        }

        System.out.println(ArrayProblem(arrA, arrB));
    }

    public static String ArrayProblem(int []arrA, int []arrB){

        int first = 0 ;
        int second = 0 ;
        for (int k : arrA) {
            first += k;
        }
        for (int i : arrB) {
            second += i;
        }
         if(first>second){
             return "First array is larger";
         }
         if(second>first){
             return "Second array is larger";
         }
        return "Both are equal"; // placeholder return
    }
}
