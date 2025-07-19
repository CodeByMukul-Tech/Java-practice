import java.util.*;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class Solution {
    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergesort(head);
        Node right = mergesort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    public static Node sortedMerge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

public class mergesorts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();

        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }

        a.head = Solution.mergesort(a.head);

        Node h = a.head;
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
