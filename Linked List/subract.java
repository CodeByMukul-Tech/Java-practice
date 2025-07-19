import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class subract {
    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node first = new Node(val);
        Node tail = first;
        for (int i = 0; i < n - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        int m = sc.nextInt();
        val = sc.nextInt();
        Node second = new Node(val);
        tail = second;
        for (int i = 0; i < m - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        Solution g = new Solution();
        Node res = g.subtract(first, second);
        printList(res);
    }
}

class Solution {
    static Node subtract(Node l1, Node l2) {
        Node l1s = reversenodes(l1);
        Node l2s = reversenodes(l2);
        int borrow = 0;

        while (l1s != null || l2s != null || borrow != 0) {
            int val1 = l1s.data;
            int val2 = (l2 != null) ? l2.data : 0;

            if (val1 < val2) {
                val1 = val1 + 10;
                borrow = 1;
                if()
            }
            
            int sum = val1 - val2 - borrow;




        }

    }

    static Node reversenodes(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }
}