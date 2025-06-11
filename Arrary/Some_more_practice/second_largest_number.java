import java.util.Scanner;

public class second_largest_number {

    public static void runner(int[] arr) {
        int n = arr.length;
        int l = arr[0];
        int idx = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > l) {
                l = arr[i];
                idx = i;
            }
        }

        int s = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > s && i != idx) {
                s = arr[i];
            }
        }

        System.out.println(s);

    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of an array : ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your favorate numbers : ");
        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }

        runner(arr);

    }

}