import java.util.*;

public class Kthnode {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node a = head;
        for(int i=1;i<n;i++) {
            Node temp = new Node(sc.nextInt());
            a.next = temp;
            a = a.next;
        }
        Node ans = Solution.findKthFromLast(head, k);
        System.out.println(ans.data);
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
class Solution {
    static Node findKthFromLast(Node head, int K) {
       if(head == null ){
        return head;
       }
       Node slow  = head; 
       Node fast = head;
       
       for(int i = 0 ; i<K;i++){
        fast = fast.next;
       }

       while (fast != null ) {
         slow = slow.next;
         fast = fast.next;
       }

       return slow;


    }
}
