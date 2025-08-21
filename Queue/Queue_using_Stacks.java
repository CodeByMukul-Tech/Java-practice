import java.util.*;

class StackQueue{
   
    // write your code here

    void Push(int a){
	  
	  
    }
   
    int Pop()  {
        return 0; 
         
    }
}

class Queue_using_stacks {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        StackQueue s = new StackQueue();	
        int q = scanner.nextInt();
       
        while (q-- > 0) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int a = scanner.nextInt();
                s.Push(a); 
            } else if (queryType == 2) {
                System.out.print(s.Pop() + " ");
            }
        }
    }
}
