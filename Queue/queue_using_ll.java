import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        // this.next = next;
    }
}

class Queue {
    // Write your code here

    Node head = null;
    Node tail = null;
    int size = 0;

    public void push(int value) {
        // Write your code here
        if (head == null) {
            Node n = new Node(value);
            head = n;
            size++;
            tail = n;
        } else {
            Node n = new Node(value);
            n.next = tail;
            tail.next = n;
            size++;
            tail = n;
        }
    }

    public int pop() {
        if (head == null)
            return -1;
        if (head == tail) {
            int sata = head.data;
            head = null;
            tail = null;
            size--;
            return sata;
        }
        int data = head.data;
        size--;
        head = head.next;
        return data;
    }

    public int front() {
        if (head == null)
            return -1;
        return head.data;
    }

    public int getSize() {
        return size;
    }
}

public class queue_using_ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                int x = sc.nextInt();
                q.push(x);
            } else if (op == 2) {
                System.out.println(q.pop());
            } else if (op == 3)
                System.out.println(q.front());
            else if (op == 4)
                System.out.println(q.getSize());
        }
    }
}