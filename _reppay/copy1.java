// this is a question of learning revese a number 

package _reppay;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            solve(n);
        }

    }

    public static void solve(int n) {
        if(n==0)return;
        System.out.println(n + " ");
        solve(n-1);

    }
}