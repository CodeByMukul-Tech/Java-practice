import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Concept{
    public static void main(String[] args) {
        
        Queue<Integer> a = new ArrayDeque<>();
        Deque<Integer> dq= new ArrayDeque<>();



        
        a.offer(10);
        a.offer(20);
        a.offer(40);


        System.out.println(a.poll());
        System.out.println(a.peek());
        System.out.println(a.poll());
        System.out.println(a.poll());

        System.out.println(a.isEmpty());
    }
}