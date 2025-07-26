import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Rearragethelist {
    static Node head;
    static Node temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            head = null;
            temp = null;
            addToTheLast(a1);

            for (int i = 1; i < n; i++) {
                int data = sc.nextInt();
                addToTheLast(data);
            }
            Solution ans = new Solution();
            Node node = ans.rearrange(head);
            printList(node);
            System.out.println();
        }
    }

    public static void addToTheLast(int data) {
        if (head == null) {
            head = new Node(data);
            temp = head;
            return;
        } else {
            Node new_node = new Node(data);
            temp.next = new_node;
            temp = temp.next;
            return;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution {

    public static Node GameChanger(Node head) {
        if (head == null || head.next == null)
            return head;

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

    public static Node rearrange(Node node) {
        if (node == null || node.next == null)
            return null;

        Node game_Finsihed = new Node(-1);
        Node game_finished_tail = game_Finsihed;
        Node creator = null;
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null) {
            creator = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        if (creator != null) {
            creator.next = null;
        }
        Node GameCreator = GameChanger(slow);
        Node Game_on_heaven = node;

        while (GameCreator != null || Game_on_heaven!= null) {
            if(Game_on_heaven!=null){
                game_finished_tail.next = Game_on_heaven;
                game_finished_tail = game_finished_tail.next;
                Game_on_heaven = Game_on_heaven.next;

            }
            if(GameCreator != null){
                game_finished_tail.next = GameCreator;
                game_finished_tail = game_finished_tail.next;
                GameCreator = GameCreator.next;
            }
            
        }

        return game_Finsihed.next;
       

    }
}
