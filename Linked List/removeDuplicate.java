import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            llist.addToTheLast(new Node(a));
        }
        Solution A = new Solution();
        llist.head = A.removeDuplicate(llist.head);
        llist.printList();

    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Solution {
    public static Node removeDuplicate(Node head) {
        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node remover = new Node(-1);


        while (fast != null && fast.next!= null) {

            slow = slow.next;
            fast = fast.next.next;
            if(slow.data >)
            
        }
    }
}