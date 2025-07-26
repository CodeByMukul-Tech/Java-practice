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

    public static int count(Node head) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;

        }
        return count;
    }

    public static Node Reversed(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }

    public static int compare(Node l1 , Node l2){
        int ll1 = count(l1);
        int ll2 = count(l2);
        if(ll1>ll2) return 1;
        if(ll2>ll1) return -1;
        
    }

    static Node subtract(Node l1, Node l2) {
        if (l1 == null || l1.next == null)
            return l2;
        if (l2 == null || l2.next == null)
            return l1;


        int count_l1 = count(l1);
        int count_l2 = count(l2);

        Node frsit = Reversed(l1);
        Node second = Reversed(l2);
        int num1 = 0 ;
        int num2 = 0 ;
        Node ans = new Node(-1);
        int bowrow = 0;

        if(count_l1 > count_l2){

            // logic for if l1 is lenght is greater than two;
           

        }
        else{

            // logic for if l2 is length is greater than one ;
        }

        Reversed(ans.next);


        return ans;

    }
}