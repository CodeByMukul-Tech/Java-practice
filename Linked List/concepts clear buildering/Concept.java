class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class Linked_List_creator {
    Node head;

    void Addtolast(int x) {
        Node newnode = new Node(x);

        Node curr = head;
        if (head == null) {
            head = newnode;
            return;
        }

        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = newnode;

    }

    void addtoFront(int x) {


    }

    void printll(){
        Node curr = head;
        while (curr.next !=null) {
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
}

public class Concept {
    public static void main(String[] args) {

    }
}