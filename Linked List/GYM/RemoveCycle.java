import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int data;
    Node next;
}

class RemoveCycle{
    public static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
    
    public static void makeLoop(Node head, int x){
        if (x == 0)
            return;
        Node curr = head;
        Node last = head;

        int currentPosition = 1;
        while (currentPosition < x)
        {
            curr = curr.next;
            currentPosition++;
        }
        
        while (last.next != null)
            last = last.next;
        last.next = curr;
    }
    
    
    public static int length(Node head){
        int ret=0;
        while(head!=null){
            ret += 1;
            head = head.next;
        }
        return ret;
    }
    public static void printList(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num = sc.nextInt();
            Node head = newNode(num);
            Node tail = head;
            for(int i=0; i<n-1; i++){
                num = sc.nextInt();
                tail.next = newNode(num);
                tail = tail.next;
            }
            int pos = sc.nextInt();
            makeLoop(head, pos);
            Solution x = new Solution();
            x.removeLoop(head);
            if( detectLoop(head) || length(head)!=n )
                System.out.println("-1");
            else
                printList(head);
        
    }
}

class Solution{
    public static void removeLoop(Node node){
       
    }
    
}
