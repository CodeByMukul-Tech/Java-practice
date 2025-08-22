import java.util.*;


class Queue {
    //Write your code here
     int[] arr ;
     int front ;
     int rear; 
     int size;
     int capacity ;
    public Queue() {
        this.front =0;
        this.rear=-1;
        size = 0;
        this.capacity =1000009;
        // capacity = 1000000009;
        arr=new int[(int) capacity];

       
    }

    public void push(int newElement) {
        rear = (rear+1)%capacity;
        arr[rear] = newElement;
        size++;

    }
    public int pop() {
        //Write your code here
        if(size==0) return -1;
        int val = arr[front];
        front = (front+1)%capacity;
        size--;

        return val;
    }
    public int front() {
        if(size ==0) return-1;
       return arr[front];
    }
    public int size() {
        if(size == 0) return -1;
       return size;
    }
}
public class Queue_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.size());
        }
    }
}