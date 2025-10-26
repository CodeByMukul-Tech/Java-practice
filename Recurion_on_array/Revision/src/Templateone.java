import java.util.Scanner;

public class Templateone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;  i< n ;i++){
          arr[i] = sc.nextInt();
        }sc.close();

        printarr(arr, n);

    }

    public static void printarr(int[] arr, int n) {
        helper(arr, 0, n);
    }

    public static void helper(int[] arr ,int i,int n){
        if(i>n-1){
            return;
        }

        System.out.print(arr[i]+" ");
        helper(arr, i+1, n);
    }

}
