import java.util.*;


class Queue_using_Two_stacks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		
	}
}


class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	   if(input.isEmpty()) return -1;

       if(output.isEmpty()){
        while (!input.isEmpty()) {
            output.push(input.pop());
            
        }
       }

       return output.pop();
        
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    input.push(x);
       
    }
}

