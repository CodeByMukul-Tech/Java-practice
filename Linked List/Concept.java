import java.util.Scanner;

class Node {
    String Name;
    Node next;

    public Node(String val) {
        this.Name = val;
        next = null;

    }
}


class LL{
    Node head;
    
    void addNodetolast(String name){
        Node newnode = new Node(name);
        if(head==null){
            head=newnode;
            return;
        }
         

        Node newNode = new Node(name);
        Node curr = head;
        while (curr.next!=null) {
            curr = curr.next;
            
        }
        curr.next= newNode;
    }

    void traverse(){
        Node curr = head;
        while (curr !=null) {
            System.out.print(curr.Name+" -> ");
            curr =curr.next;
            
        }
        System.out.println("null");
    }
  
     void size(){
        Node curr = head;
        int count = 0;
        while (curr !=null) {
         count++;
         curr =curr.next;
            
        }
        System.out.println(count);
     }


}

public class Concept {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL person = new LL();
        
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        // int count = 1;
        for(int i = 1; i <= n; i++) {
            String names = sc.nextLine();
            // System.out.println(count);
            // count++;
            person.addNodetolast(names);
        }

        person.traverse();
        person.size();
    }
}