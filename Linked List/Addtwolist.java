import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
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

public class Addtwolist {
    public static Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public static void combine(Node l1, Node l2, LinkedList ans) {
        Node dummy = new Node(-1);
        Node tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.data : 0;
            int val2 = (l2 != null) ? l2.data : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            tail.next = new Node(digit);
            tail = tail.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

       

        Node prev = null;
        Node curr= dummy;
        Node next = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

         Node result = prev.next;
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(input.nextInt());
        }
        a.head = reverse(a.head);
        b.head = reverse(b.head);
        LinkedList ans = new LinkedList();
        combine(a.head, b.head, ans);
        ans.head = reverse(ans.head);
        Node h = ans.head;
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println("");
    }
}