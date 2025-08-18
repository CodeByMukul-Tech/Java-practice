import java.io.*;
import java.util.*;

public class postfic_to_infix_solve_prefix {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob = new Solution();
    ob.evaluation(exp);
  }
}

class Solution {

  public boolean isoperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/');
  }

  public int calculate(int op1, int op2, char c) {

    if (c == '+')
      return op1 + op2;

    if (c == '-')
      return op1 - op2;
    if (c == '*')
      return op1 * op2;
    return op2 / op1;
  }

  public void solve(String exp) {
    int n = exp.length();
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < n; i++) {
      char c = exp.charAt(i);
      if (isoperator(c)) {
        int op1 = st.pop();
        int op2 = st.pop();
        st.push(calculate(op1, op2, c));

      } else {
        st.push(c - '0');
      }
    }

    System.out.println(st.pop());

  }

  public void evaluation(String exp) {
    solve(exp);
    // postfix(exp);
    // prefix(exp);
  }
}