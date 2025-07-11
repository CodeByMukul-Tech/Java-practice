package Strings;

import java.io.*;
import java.util.*;

public class Palindrome {
   static int isPalindrome(String str) {
    str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
    int n = str.length();
    
    for (int i = 0; i < n / 2; i++) {
        if (str.charAt(i) != str.charAt(n - 1 - i)) {
            return 0; // Not a palindrome
        }
    }
    return 1; // Is a palindrome
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);
    }
}