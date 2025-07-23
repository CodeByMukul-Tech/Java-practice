
// A Java program to print all anagrams together
import java.util.*;

public class Main {
    // Given a list of words in wordArr[],
    static String Sorted(String n) {
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
//  n^2(log n);
    static void printAnagramsTogether(String wordArr[], int size) {

        Map<String, List<String>> map = new HashMap<>();
        String prevstr = "";
       
        

    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }
}