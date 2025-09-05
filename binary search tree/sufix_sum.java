public class sufix_sum {
    static int[] arr(int[] a, int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i++) {
            if (i == n - 1)
                ans[i] = a[i];
            else {
                ans[i] = ans[i] + a[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }

}
