import java.util.*;

class Browser {

    String url;
    Node prev;
    Node next;

    public Browser(String val) {
        this.url = val;
        prev = null;
        next = null;
    }

}

class Browser {

    public Browser(String homePage) {
        // Write you code here
    }

    public void visit(String string) {
        // Write you code here

    }

    public String back(int parseInt) {
        // Write your code here
    }

    public String forward(int parseInt) {
        // Write your code here
    }

}

public class Design_browser_history {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        q--;
        String s = sc.next();
        Browser br = new Browser(s);

        while (q-- > 0) {
            String k = sc.next();
            int kk = Integer.parseInt(k);
            if (kk == 1) {
                String vis = sc.next();
                br.visit(vis);
            } else if (kk == 2) {
                String b = sc.next();
                int back = Integer.parseInt(b);
                System.out.print(br.back(back) + " ");
            } else {
                String b = sc.next();
                int forward = Integer.parseInt(b);
                System.out.print(br.forward(forward) + " ");
            }
        }

    }
}