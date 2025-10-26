import java.util.Scanner;

class Solution {

    public void printer(char c) {
        // Base condition
        if (c > 'Z' && c < 'a')
            return; // skip gap between uppercase and lowercase
        if (c > 'z')
            return; // stop recursion for lowercase

        System.out.print(c+" ");
        printer((char) (c + 1)); // recursive call with next character
    }
}

public class ATOZ {
    public static void main(String[] args) {
        Scanner jarvis = new Scanner(System.in);
        char a = jarvis.next().charAt(0);
        Solution s = new Solution();
        s.printer(a);
        jarvis.close();
    }
}
