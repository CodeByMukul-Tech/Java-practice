package Strings;
import java.util.*;

public class toggles {

  @SuppressWarnings("resource")
  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    toggleCase(n, str);
  }

  static void toggleCase(int n, String str) {
    char[] c = str.toCharArray();
    char[] a = new char[n];
    for (int i = 0; i < n; i++) {
      if (c[i] >= 65 && c[i] <= 90) {
        a[i] = (char) ((c[i] + 32));

      } else if (c[i] >= 97 && c[i] <= 122) {
        a[i] = (char) ((c[i] - 32));
      } else {
        a[i] = c[i];
      }

    }

    String ans = Arrays.toString(a);
    ans= ans.replace(",","");
    ans = ans.replace("[", "");
    ans = ans.replace("]", "");
    ans= ans.replace(" ", "");
    System.out.println(ans);
  }
}