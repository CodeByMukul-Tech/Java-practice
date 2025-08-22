import java.util.*;

class StackQueue {

    // write your code here
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void Push(int a) {
        s1.push(a);
    }

    int Pop() {
       if(s1.isEmpty()&&s2.isEmpty()) return -1;
        if (s2.isEmpty()) {
           while (s1.isEmpty()) {
            s2.add(s1.pop());
            
           }
            
        }

        return s2.pop();

    }
}

class Queue_using_stacks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackQueue s = new StackQueue();
        int q = scanner.nextInt();

        while (q-- > 0) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int a = scanner.nextInt();
                s.Push(a);
            } else if (queryType == 2) {
                System.out.print(s.Pop() + " ");
            }
        }
    }
}
