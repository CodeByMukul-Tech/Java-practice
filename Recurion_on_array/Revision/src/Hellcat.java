import java.util.*;

public class Hellcat {
    static String PairStar(String str) {
        char prev_char = str.charAt(0);
        
        int idx = 0;

       return strgiver(str,prev_char,idx);
        
    }

    static String strgiver(String str, char prev_char, int idx) {
        if (idx >= str.length()) return "";
        
        char currentChar = str.charAt(idx);
        if (idx > 0 && currentChar == prev_char) {
            return "*" + currentChar + strgiver(str, currentChar, idx + 1);
        }
        return currentChar + strgiver(str, currentChar, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PairStar(s));
    }
}