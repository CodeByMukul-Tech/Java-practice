import java.util.*;

// input 1 
// 2
// ()
// output is true 
//  input 2 
// 2 
// (]
// output is false ;



class Solution{
    public void balancedBrackets(String s, int n) {
      Stack<Character> ans  = new Stack<>();
      boolean check = false;
      for(int i = 0 ; i< n ;i++){
        char c = s.charAt(i);
        if(c=='('||c=='{'||c=='['){
            ans.push(c);

        }
        else if(ans.isEmpty()&&(c==')'||c==']'||c=='}')){
            ans.pop();
            check = true;
           
        }
        
      }
      if(check){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
}

public class correct_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}