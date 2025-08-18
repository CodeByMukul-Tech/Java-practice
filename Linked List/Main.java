import java.util.*;

class Solution{
    public int numRabbits(int[] answers) {
       Map<Integer,Integer> freq = new HashMap<>();
       for(int i = 0 ; i< answers.length;i++){
          freq.put(answers[i],freq.getOrDefault(answers[i], 0)+1);
       }
       
       
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj =  new Solution();
        System.out.println(Obj.numRabbits(arr));
    }
}
