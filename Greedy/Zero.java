//{ Driver Code Starts
// import java.util.*;
import java.io.*;
// import java.lang.*;

class ONe_Knapsnack
{
public
    static void main(String args[]) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String xx[] = read.readLine().trim().split("\\s+");
        int n = Integer.parseInt(xx[0]);
        int w = Integer.parseInt(xx[1]);
        int val[] = new int[n];
        int wt[] = new int[n];
        String st[] = read.readLine().trim().split("\\s+");
        for (int i = 0; i < n; i++)
            val[i] = Integer.parseInt(st[i]);
        String s[] = read.readLine().trim().split("\\s+");
        for (int i = 0; i < n; i++)
            wt[i] = Integer.parseInt(s[i]);
        System.out.println(new Solution().knapSack(w, wt, val, n));
    }
}

class Solution
{

    int knapSack(int W, int wt[], int val[], int N)
    {
       
    }
}


