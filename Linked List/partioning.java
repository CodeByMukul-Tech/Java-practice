import java.io.*;
import java.util.*;

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
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    public void partition(Node head, int x) {
        if (head == null)
            return;
        Node Smaller = new Node(-1);
        Node greater = new Node(-1);
        Node smalltail = Smaller;
        Node greaterTail = greater;
        Node curr = head;

        while (curr != null) {
            if (curr.data < x) {
                smalltail.next = curr;
                smalltail =smalltail.next;

            } else {
                greaterTail.next = curr;
                 greaterTail = greaterTail.next;
            }
            curr = curr.next;
        }

        greaterTail.next = null;
        smalltail.next = greater.next;


        Node result = Smaller;
        while (result != null) {
            System.out.print(result.data +" ");
            result= result.next;    
        }

    }
}

public class partioning {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}