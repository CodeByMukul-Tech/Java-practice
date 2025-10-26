import java.util.Scanner;

public class TemplateTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        printarr(arr, n);

    }

    public static void printarr(int[] arr, int n) {
        if (n == 0)
            return;

        printarr(arr, n - 1);
        System.out.print(arr[n - 1] + " ");
    }

}
