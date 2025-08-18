import java.util.*;

class Solution{
    public static boolean checkValidString(int n, String s){
        //write code here
    }
}

public class VALid_strings {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s = sc.next();
        Solution obj = new Solution();
        boolean ans = obj.checkValidString(n,s);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}