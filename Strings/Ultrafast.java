import java.util.*;

public class Ultrafast {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        String B = scn.nextLine();
        StringBuilder a = new StringBuilder(A);
        StringBuilder b = new StringBuilder(B);
        StringBuilder c = solve(a, b);
        System.out.println(c);
    }

    static StringBuilder solve(StringBuilder a, StringBuilder b) {
        String s1 = a.toString();
        String s2 = b.toString();
        StringBuilder result = new StringBuilder();
        int n = s1.length();
        // int m = s2.length();
        for(int i = 0 ; i< n;i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1==ch2){
                result.append('0');
            }else{
                result.append('1');
            }
        }

        return result;

    }

}