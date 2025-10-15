import java.util.*;

public class postfix_to_value
{
    static int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String s : tokens) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            int b = stack.pop();
            int a = stack.pop();
            int ans = 0;

            switch (s) {
                case "+":
                    ans = a + b;
                    break;
                case "-":
                    ans = a - b;
                    break;
                case "*":
                    ans = a * b;
                    break;
                case "/":
                    ans = a / b;
                    break;
            }

            stack.push(ans);
        } else {
            stack.push(Integer.parseInt(s)); // convert number string to int
        }
    }

    return stack.pop();
}

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int n = input.nextInt();
	  String[] arr = new String[n];
	  for(int i=0; i<n; i++)
	  {
	      arr[i] = input.next();
	  }
	  System.out.println(evalRPN(arr));
      input.close();
	}
    
}
