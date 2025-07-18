import java.util.*;

public class Sortedornot {
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
            
        Accio A = new Accio();
        A.checkListSorted(llist.head);
        
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

class Accio
{
    static boolean checklist(Node head){

        Node curr = head;
        while (curr.next != null && curr !=null) {
            if(curr.data > curr.next.data){
                return false;
            }
            curr = curr.next;
            
        }


        return true;
    }
    static void checkListSorted(Node head)
    {
        if(checklist(head)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
      
    }
}