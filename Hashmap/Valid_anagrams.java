import java.util.*;

class Solution {
    static boolean areAnagram(String c1, String c2) {
        if (c1.length() != c2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : c1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : c2.toCharArray()) {
            if (!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) return false;
        }

        return true;
    }
}



public class Valid_anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();

        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
