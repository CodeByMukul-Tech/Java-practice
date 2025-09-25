import java.util.*;
import java.lang.*;
import java.io.*;

public class Largest_Possible{

    public static String largestNumber(final int[] a) {
        // your code here
        Arrays.sort(a);
        
    }
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(largestNumber(arr));
	}
}