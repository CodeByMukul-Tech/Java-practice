import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean ExtraBrackets(String exp) {
        Stack<Character> Spam = new Stack<>();
        // Write your code here
        // complexcity is O(n)

        int n = exp.length();
        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);
            if (c == ')') {
                if (!Spam.isEmpty() && Spam.peek() == '(')
                    return true;
                while (!Spam.isEmpty() && Spam.peek() != '(') {
                    Spam.pop();

                }
                Spam.pop();

            } else {
                Spam.push(c);

            }

        }

        return false;

    }
}

public class Extrac_brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution Obj = new Solution();
        if (Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}