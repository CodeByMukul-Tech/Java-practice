import java.util.*;
class circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p[] = new int[n];
			int d[] = new int[n];
			

        for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
			System.out.println(new Solution().tour(p,d));
	}
}
class Solution
{
	int tour(int petrol[], int distance[])
	{
        int n  = petrol.length;
        int total_petrol =0;
        int total_distance = 0;
        for(int i = 0 ; i<n;i++){
            total_distance +=distance[i];
            total_petrol+=petrol[i];

        }

        if(total_petrol<total_distance) return -1;

        int start = 0 ;
        int currpetrol = 0 ;
        for(int i = 0 ; i<n;i++){
            currpetrol+=petrol[i];
            currpetrol-=distance[i];

            if(currpetrol<=0){
                currpetrol =0;
                start = start+1;
            }
            
        }

        for(int i = 0 ;i<n;i++){
            int idx = (i+start)%n;
            currpetrol+=petrol[idx];
            currpetrol+=distance[idx];

            if (currpetrol<=0) {
                currpetrol =0;
                start+=1;
                
            }
        }

        return start;
		
	}
}