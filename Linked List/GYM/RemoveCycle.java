import java.util.*;

class Node {
    int data;
    Node next;
}

class RemoveCycle {
    public static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public static void makeLoop(Node head, int x) {
        if (x == 0)
            return;
        Node curr = head;
        Node last = head;

        int currentPosition = 1;
        while (currentPosition < x) {
            curr = curr.next;
            currentPosition++;
        }

        while (last.next != null)
            last = last.next;
        last.next = curr;
    }

    public static int length(Node head) {
        int ret = 0;
        while (head != null) {
            ret += 1;
            head = head.next;
        }
        return ret;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
        int num = sc.nextInt(); // First node data
        Node head = newNode(num);
        Node tail = head;
        for (int i = 0; i < n - 1; i++) {
            num = sc.nextInt();
            tail.next = newNode(num);
            tail = tail.next;
        }
        int pos = sc.nextInt(); // Position to form loop
        makeLoop(head, pos);

        Solution x = new Solution();
        x.removeLoop(head);

        // Validate
        if (detectLoop(head) || length(head) != n)
            System.out.println("-1");
        else
            printList(head);
    }
}

class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        if (slow != fast)
            return;

        slow = head;
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }
}
