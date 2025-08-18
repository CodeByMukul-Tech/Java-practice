import java.util.*;

public class Reverse_a_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(reverseParentheses(s));
    }

    public static String reverseParentheses(String s) {
        // your code here
        int n = s.length();
        String reverse = "";

        Stack<Character> ans = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ')') {
              if(!ans.isEmpty()&&ans.peek()=='('){
                 reverse= (String)c;
                ans.pop();
              }

            } else {
                ans.push(c);

            }
        }

        return reverse;
    }
}