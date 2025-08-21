import java.util.Scanner;
import java.util.Stack;

class Accio {
    public Stack<Integer> sort(Stack<Integer> s) {
      Stack<Integer> st = new Stack<>();
      
    }
}

public class Sort_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(sc.nextInt());
        }
        Accio accio = new Accio();
        accio.sort(stack);
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}