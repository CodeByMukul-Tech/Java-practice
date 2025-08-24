import java.util.*;

public class notaions {

    static int calculate(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;


            default:
                break;
        }
        return 0;
    }

    static int evalRPN(String[] tokens ,int  n ) {
       Stack<Character> st = new Stack<>();
	   for(int i = 0 ; i< n ;i++){
		char c = (char) tokens[i];
        if(Character.isDigit(c)){
         st.push(c);
        }
        else{
            int a = (int) st.pop();
            int b = (int) st.pop();
            st.push((char)calculate(a, b, c) );
        }
	   }
        int as = (int)st.pop();
        return as;
	   
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }
        System.out.println(evalRPN(arr, n));
    }
})