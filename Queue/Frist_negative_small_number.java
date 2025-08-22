import java.util.*;

class Solution {

    // Function to find first negative in every window of size k
    public static int[] printFirstNegativeInteger(int[] arr, int n, int k) {
       ArrayList<Integer> ans = new ArrayList<>();
       Deque<Integer> q = new ArrayDeque<>();
       int L = 0 ; 
       for(int R = 0 ;R<n;R++){
        if(arr[R]<0){
            q.addLast(R);
        }

        if(R-L+1==k){
            if(!q.isEmpty()){
                ans.add(arr[q.peekFirst()]);
            }else{
                ans.add(0);
            }

            if(!q.isEmpty()&&q.peekFirst() ==L){
                q.removeFirst();
            }
            L++;
        }
       }

       int[] ans1 = new int[ans.size()];
       for(int i = 0 ; i< ans.size();i++){
        ans1[i] = ans.get(i);
       }

       return ans1;
    }
}

public class Frist_negative_small_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = Solution.printFirstNegativeInteger(arr, n, k);
        for (int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}
