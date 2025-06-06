package Nested_loops;

import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;

        if (n >= 1)
            System.out.println(f1);
        if (n >= 2)
            System.out.println(f2);

        for (int i = 2; i < n; i++) {
            int f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int a = sc.nextInt();
        fibonacci(a);
        sc.close();
    }
}
