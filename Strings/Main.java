import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution ob = new Solution();
        ob.evaluation(exp);
    }
}

class Solution {

    public int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    public int calculate(int op1, int op2, char c) {
        switch (c) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': return op1 / op2;
        }
        return 0;
    }

    // Infix Evaluation
    public void solve(String exp) {
        int n = exp.length();
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                i--;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    values.push(calculate(a, b, ops.pop()));
                }
                ops.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    int b = values.pop();
                    int a = values.pop();
                    values.push(calculate(a, b, ops.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            values.push(calculate(a, b, ops.pop()));
        }

        System.out.println("Infix Evaluation: " + values.pop());
    }

    // Infix to Postfix
    public void postfix(String exp) {
        int n = exp.length();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    System.out.print(exp.charAt(i));
                    i++;
                }
                System.out.print("");
                i--;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    System.out.print(ops.pop() + "");
                }
                if (!ops.isEmpty()) ops.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    System.out.print(ops.pop() + "");
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            System.out.print(ops.pop() + "");
        }
        System.out.println();
    }

    // Infix to Prefix
    public void prefix(String exp) {
        Stack<String> operands = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                String num = "";
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num += exp.charAt(i);
                    i++;
                }
                operands.push(num);
                i--;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    String b = operands.pop();
                    String a = operands.pop();
                    char op = ops.pop();
                    operands.push(op + "" + a + "" + b);
                }
                ops.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    String b = operands.pop();
                    String a = operands.pop();
                    char op = ops.pop();
                    operands.push(op + "" + a + "" + b);
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            String b = operands.pop();
            String a = operands.pop();
            char op = ops.pop();
            operands.push(op +""+ a +""+ b);
        }

        System.out.println("Prefix: " + operands.pop());
    }

    public void evaluation(String exp) {
        solve(exp);       // Infix evaluation
        postfix(exp);     // Postfix print
        prefix(exp);      // Prefix print
    }
}
