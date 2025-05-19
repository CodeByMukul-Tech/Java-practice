package _reppay;

import java.util.Scanner;

public class pattern_print {

    // Recursive method to print stars in a row
    public static void star(int col) {
        if (col == 0) return;
        System.out.print("* ");
        star(col - 1);
    }

    // Recursive method to print rows
    public static void solve(int rows, int currentRow) {
        if (currentRow > rows) return;
        star(currentRow);
        System.out.println();
        solve(rows, currentRow + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, 1);
        sc.close();
    }
}
