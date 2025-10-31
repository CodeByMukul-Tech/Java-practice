import java.util.*;

class Accio {

    public void printPermutations(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedcart = chars.toString();
        // List<String> asn = new ArrayList<>();
        helper(sortedcart, "");
        return;
    }

    public void helper(String sortedcart, String pere) {
        if (sortedcart.length() == 0) {
            System.out.println(pere);
        }

        for (int i = 0; i < sortedcart.length(); i++) {
            if (i > 0 && sortedcart.charAt(i) == sortedcart.charAt(i - 1))
                continue;
            char c = sortedcart.charAt(i);
            String rem = sortedcart.substring(0, i) + sortedcart.substring(i + 1);
            helper(rem, pere + c);
        }

    }
}

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printPermutations(str);
        sc.close();
    }
}
