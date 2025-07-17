
import java.util.*;

public class Roatated {}
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
        int k = sc.nextInt();
        Solution A = new Solution();
        llist.head = A.rotate(llist.head, k);
        llist.printList();
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Solution{
    public static Node rotate(Node head, int k){

        int idx = 0 ; 
        int n = k-1;
             
        if(head == null || head.next == null){
            return head;
        }

        if(k== 0 || k==n){
            return head;
        }
        
        Node newNodes  = new  Node(n);
        Node curr = head;
        while (curr.next != null && curr != null) {
            if(idx == k){



            }
            idx = idx+1;
            
        }
    }
}