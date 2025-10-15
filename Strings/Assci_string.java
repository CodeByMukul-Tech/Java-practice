
// import java.io.*;
import java.util.*;

public class Assci_string {

    public static String solution(String str) {
        StringBuilder MARK95 = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int a = (int) str.charAt(i);
            int b = (int) str.charAt(i + 1);
            int c = b - a;
            MARK95.append(str.charAt(i) + "" + c);

        }

        return MARK95.toString();

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }
}