import java.util.*;

class Accio {
    static int BillDivision(int n, int k, int[] bill, int charge) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += bill[i];
        }

        // Anna ne ye item nahi khaya
        sum -= bill[k];

        // Actual share
        int actualShare = sum / 2;

        // Overcharged amount
        return charge - actualShare;
    }
}


public class Bill_division {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for (int i = 0; i < n; ++i) {
            bill[i] = sc.nextInt();
        }
        int charge = sc.nextInt();
        Accio obj = new Accio();
        int ans = obj.BillDivision(n, k, bill, charge);
        System.out.println(ans);
    }
}